# Java Practical Projects

This directory contains three Java projects as per your requirements:

## 1. JDBC Bank Transaction Program
**Location:** `BankTransaction.java`

 Requirements:
- MySQL database
- MySQL JDBC Driver
###
### Setup:
1. Run the `database_setup.sql` script in MySQL to create the database and table
2. Update database credentials in `BankTransaction.java` if needed:
   - `DB_URL`: "jdbc:mysql://localhost:3306/lenden"
   - `DB_USER`: "root"
   - `DB_PASSWORD`: "password"

### Features:
- Accepts account number and amount from user
- Debits amount from specified account
- Credits amount to account 102
- Uses transaction management with `setAutoCommit(false)`, `commit()`, and `rollback()`
- Checks for sufficient balance before transaction
- Handles transaction failures with rollback

### Run:
```bash
javac -cp "mysql-connector-j-8.0.33.jar" BankTransaction.java
java -cp ".;mysql-connector-j-8.0.33.jar" BankTransaction
```

## 2. Spring Boot Hello REST API
**Location:** `hello-spring-boot/`

### Features:
- GET `/hello` endpoint returning "Hello from Spring Boot!"

### Run:
```bash
cd hello-spring-boot
mvn spring-boot:run
```

### Access:
- Open browser and navigate to: `http://localhost:8080/hello`

## 3. Spring Boot Dependency Injection Demo
**Location:** `dependency-injection-demo/`

### Features:
- Demonstrates all 3 types of dependency injection:
  - Field Injection
  - Constructor Injection  
  - Setter Injection
- REST endpoints to test each injection type

### Run:
```bash
cd dependency-injection-demo
mvn spring-boot:run
```

### Test Endpoints:
- Field Injection: `http://localhost:8080/test-field/Test`
- Constructor Injection: `http://localhost:8080/test-constructor/Test`
- Setter Injection: `http://localhost:8080/test-setter/Test`
- All Types: `http://localhost:8080/test-all/Test`

### Output:
Check the console for email sending messages from each injection type.
