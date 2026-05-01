-- Database setup for Bank Transaction program

-- Create database if not exists
CREATE DATABASE IF NOT EXISTS lenden;

-- Use the database
USE lenden;

-- Create accounts table
CREATE TABLE IF NOT EXISTS accounts (
    account_number INT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    balance DECIMAL(10, 2) NOT NULL
);

-- Insert sample data (you can modify these values)
INSERT INTO accounts (account_number, name, balance) 
VALUES 
    (101, 'John Doe', 1000.00),
    (102, 'Jane Smith', 500.00)
ON DUPLICATE KEY UPDATE 
    name = VALUES(name), 
    balance = VALUES(balance);

-- Display the data to verify
SELECT * FROM accounts;
