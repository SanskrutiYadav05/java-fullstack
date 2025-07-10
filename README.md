# 📚 Student management System
The Student Management System is a Java Maven project it a simple console-based application that uses JDBC to connect to a PostgreSQL database, allowing users to add and view student records efficiently

---
## 🚀 Features
- Simple Java console-based interaction
- Easy to use and extend
- Clean separation between logic and model
- Beginner-friendly JDBC example
---
## ⚙️ Technologies Used
- Java 17
- Apache Maven 3.8.6+
- PostgreSQL 15+
- JDBC 4.2
- Multithreading & File I/O
---
  ## Dependancy
  ```xml
  <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
            <version>42.7.1</version>
        </dependency>
```
---
  ## Prerequisites
- Java JDK 17+
- Apache Maven 3.8.6+
- PostgreSQL 15+
---

## Database Setup

1. Create a Database
    - **Create DATABASE studentdb;**
2. Create a Table
   
    - **CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(100), email VARCHAR(100));**
---
## Project Structure
StudentManagementSystem/
├── pom.xml
└── src/
    └── main/
        └── java/
            └── student/
                ├── Main.java
                ├── DBConnection.java
                ├── Student.java
                └── StudentOperations.java

---

## Contact

- **Developer: Sanskruti Santosh Yadav**
- **Email: yadavsanskruti17@gmail.com**
- **GitHub: SanskrutiYadav05**
---

## output Image for Reference

![My Code Screenshot](https://github.com/SanskrutiYadav05/java-fullstack/blob/main/code1.png)


