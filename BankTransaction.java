import java.sql.*;
import java.util.Scanner;

public class BankTransaction {
    // Database configuration
    private static final String DB_URL = "jdbc:mysql://localhost:3306/lenden";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "1234";
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            // Load MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Get user input
            System.out.print("Enter account number: ");
            int accountNumber = scanner.nextInt();
            
            System.out.print("Enter amount to transfer: ");
            double amount = scanner.nextDouble();
            
            // Perform transaction
            performTransaction(accountNumber, amount);
            
        } catch (ClassNotFoundException e) {
            System.err.println("MySQL JDBC Driver not found: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Database error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    
    private static void performTransaction(int fromAccount, double amount) throws SQLException {
        Connection conn = null;
        
        try {
            // Establish database connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // Disable auto-commit for transaction management
            conn.setAutoCommit(false);
            
            // Check if sufficient balance exists
            if (!hasSufficientBalance(conn, fromAccount, amount)) {
                System.out.println("Transaction Failed - Insufficient balance");
                conn.rollback();
                return;
            }
            
            // Debit amount from source account
            debitAccount(conn, fromAccount, amount);
            
            // Credit amount to account 102
            creditAccount(conn, 102, amount);
            
            // Commit transaction if all operations successful
            conn.commit();
            System.out.println("Transaction Successful");
            
        } catch (SQLException e) {
            // Rollback transaction if any error occurs
            if (conn != null) {
                try {
                    conn.rollback();
                    System.out.println("Transaction Failed - " + e.getMessage());
                } catch (SQLException rollbackEx) {
                    System.err.println("Error during rollback: " + rollbackEx.getMessage());
                }
            }
            throw e;
        } finally {
            // Restore auto-commit and close connection
            if (conn != null) {
                try {
                    conn.setAutoCommit(true);
                    conn.close();
                } catch (SQLException e) {
                    System.err.println("Error closing connection: " + e.getMessage());
                }
            }
        }
    }
    
    private static boolean hasSufficientBalance(Connection conn, int accountNumber, double amount) 
            throws SQLException {
        String sql = "SELECT balance FROM accounts WHERE account_number = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, accountNumber);
            
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    double currentBalance = rs.getDouble("balance");
                    return currentBalance >= amount;
                } else {
                    throw new SQLException("Account not found: " + accountNumber);
                }
            }
        }
    }
    
    private static void debitAccount(Connection conn, int accountNumber, double amount) 
            throws SQLException {
        String sql = "UPDATE accounts SET balance = balance - ? WHERE account_number = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountNumber);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Failed to debit account: " + accountNumber);
            }
        }
    }
    
    private static void creditAccount(Connection conn, int accountNumber, double amount) 
            throws SQLException {
        String sql = "UPDATE accounts SET balance = balance + ? WHERE account_number = ?";
        
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setDouble(1, amount);
            pstmt.setInt(2, accountNumber);
            
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("Failed to credit account: " + accountNumber);
            }
        }
    }
}
