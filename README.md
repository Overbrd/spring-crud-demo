# Spring CRUD Demo
A clean, lightweight Spring Boot REST API demonstrating CRUD operations, an in‑memory H2 database, and a simple service/repository architecture. This project is designed as a backend demo for developer portfolios and technical recruiters evaluating Java/Spring proficiency.

---

## 🚀 Features
- Full CRUD operations for Project entities
- RESTful JSON API using Spring Web
- In‑memory H2 database with console access
- Maven Wrapper included (no global Maven install required)
- Zero external dependencies beyond JDK
- Runs on Windows with minimal setup

---

## 🧰 Software Required (Windows)

1. **Java Development Kit (JDK 17 or higher)**  
   Download: https://adoptium.net  
   Verify installation:  
   `java -version`

2. **Git for Windows**  
   Download: https://git-scm.com/download/win  
   Verify:  
   `git --version`

3. **IDE (choose one)**  
   - IntelliJ IDEA Community (recommended)  
   - Visual Studio Code with Java extensions  
   - Eclipse (optional)

4. **Maven (optional)**  
   Not required because the project includes Maven Wrapper (`mvnw`), but you may install Maven globally if preferred.

---

## 📦 Clone the Repository

`git clone https://github.com/Overbrd/spring-crud-demo.git`  
`cd spring-crud-demo`

---

## 📁 Project Folder Structure (High‑Level)

spring-crud-demo/  
pom.xml  
mvnw  
mvnw.cmd  
.gitignore  
.gitattributes  
src/  
main/  
java/com/matthewlind/springcrud/  
SpringCrudDemoApplication.java  
controller/  
service/  
repository/  
model/  
resources/  
application.properties  
test/  


---

## ▶️ Running the Application on Windows

### Option A — Run using Maven Wrapper (recommended)

`mvnw spring-boot:run`

The app will start on port 8080.

### Option B — Build and run the JAR

Build the JAR:  
`mvnw clean package`

Run the JAR:  
`java -jar target/spring-crud-demo-0.0.1-SNAPSHOT.jar`

Expected output:  
`Started SpringCrudDemoApplication in X seconds`

---

## 🌐 API Endpoints

Postman or similar settings to test:   

Base URL:  
`http://localhost:8080/api/projects`

- GET all projects  
  `GET /api/projects`

- POST create a project  
  `POST /api/projects`  
  Headers: Content-Type: application/json  
  Example body:  
  `{ "name": "Portfolio Tracker", "description": "Tracks projects for my dev portfolio", "status": "IN_PROGRESS" }`

- PUT update a project  
  `PUT /api/projects/{id}`

- DELETE a project  
  `DELETE /api/projects/{id}`

---

## 🗄️ H2 Database Console

Open in browser:  
`http://localhost:8080/h2-console`

Login settings:  
- JDBC URL: `jdbc:h2:mem:testdb`  
- User: `sa`  
- Password: *(leave blank)*

Query example:  
`SELECT * FROM PROJECT;`

---






