# 🚀 Java Practical Projects - Quick Guide

**All Java practical work successfully implemented and tested.**

---

## 📁 **Projects Overview**

| Project | Status | Location | Key Feature |
|---------|--------|---------|-------------|
| JDBC Bank Transaction | ✅ Working | BankTransaction.java | MySQL transactions |
| Spring Boot Hello API | ✅ Working | hello-spring-boot/ | REST endpoint |
| Dependency Injection Demo | ✅ Working | dependency-injection-demo/ | 3 types of DI |
| Design Thinking Attendance | ✅ Working | attendance-system/ | 5-stage methodology |
| Agile Project Manager | ✅ Working | agile-project-manager/ | TDD implementation |
| Jenkins CI/CD Pipeline | ✅ Working | jenkins-demo-app/ | Complete pipeline |
| Cloud Computing | ✅ Working | cloudcomputing.md | Architecture design |

---

## 🚀 **Quick Start Commands**

### **JDBC Program**
```bash
# Setup database
mysql -u root -p < database_setup.sql

# Run program
javac -cp "mysql-connector-j-8.0.33.jar" BankTransaction.java
java -cp ".;mysql-connector-j-8.0.33.jar" BankTransaction
```

### **Spring Boot Projects**
```bash
# Hello API
cd hello-spring-boot
mvn spring-boot:run
# Test: http://localhost:8080/hello

# Dependency Injection Demo  
cd dependency-injection-demo
mvn spring-boot:run
# Test: http://localhost:8080/test-all/Test

# Attendance System
cd attendance-system
mvn spring-boot:run
# Test: http://localhost:8081/api/attendance/mark

# Agile Manager
cd agile-project-manager
mvn test
# Output: Tests run: 7, Failures: 0

# Jenkins Demo
cd jenkins-demo-app
mvn clean test package
# Output: Build success
```

---

## 📋 **Viva Questions - Quick Reference**

### **Top 10 Questions:**

1. **DriverManager?** Manages database drivers and connections
2. **setAutoCommit(false)?** Manual transaction control
3. **@RestController?** Spring REST annotation
4. **TDD?** Test-first development
5. **Velocity?** Sprint capacity measurement
6. **Jenkins Pipeline?** CI/CD automation
7. **Design Thinking?** 5-stage methodology
8. **Dependency Injection?** Framework provides dependencies
9. **Field vs Constructor?** Injection methods comparison
10. **ACID?** Database transaction properties

---

## 🔧 **Setup Requirements**

1. **JDK 17+** - Java development
2. **Maven 3.8+** - Build tool
3. **MySQL 8.0+** - For JDBC program
4. **Git** - Version control

---

## 🌐 **Repository**

**GitHub:** https://github.com/DeepGoyani/practical.git

---

## 📞 **Need Help?**

Each project has:
- ✅ Working code
- ✅ Test results
- ✅ Setup instructions
- ✅ Detailed documentation

**Ready for practical exam!** 🎯
