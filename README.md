# Spring CRUD Demo
A clean, lightweight Spring Boot REST API demonstrating CRUD operations, an in‑memory H2 database, and a simple service/repository architecture. This project is designed as a backend demo of Java/Spring proficiency.

---

## 🚀 Features
- Full CRUD operations for Project entities
- RESTful JSON API using Spring Web
- In‑memory H2 database with console access
- Maven Wrapper included (no global Maven install required)
- Zero external dependencies beyond JDK
- Runs on Windows with minimal setup

---

## 🧩 How This Project Uses Java

This application is built entirely with modern Java (JDK 17+), taking advantage of the language’s strong typing, object‑oriented design, and mature ecosystem. Java powers every layer of the project:

- **Model Layer (Java Classes)**  
  The `Project` entity is a plain Java object (POJO) representing application data.  
  Java’s class structure makes it easy to define fields, constructors, and validation rules.

- **Service Layer (Business Logic)**  
  Java interfaces and classes organize the core logic that processes incoming requests, updates data, and enforces rules.  
  This keeps the code clean, testable, and modular.

- **Repository Layer (Spring Data JPA)**  
  Java generics and interfaces allow the repository to automatically generate CRUD operations without writing SQL.  
  Spring Boot uses Java annotations to wire everything together.

- **Controller Layer (REST Endpoints)**  
  Java annotations like `@RestController`, `@GetMapping`, and `@PostMapping` expose clean, readable REST endpoints.  
  Java handles JSON serialization automatically through Jackson.

- **Application Bootstrap**  
  The main class uses Java’s entry‑point method `public static void main(String[] args)` to launch the Spring Boot runtime.

In short, Java provides the structure, safety, and clarity that make this project easy to maintain and extend.

---

## 📘 Spring CRUD Demo — Overview

**🧱 Spring CRUD Demo — Java + Spring Boot + H2 Database**

### 📄 Details  
- **Language:** Java (JDK 17+)  
- **Framework:** Spring Boot  
- **Database:** H2 in‑memory SQL database  
- **Architecture:** Controller → Service → Repository → Model  
- **Build Tool:** Maven Wrapper (`mvnw`)  
- **Purpose:** Demonstrates clean, modern Java backend development for portfolio and recruiter review  
- **Runtime:** Windows, macOS, Linux (this README focuses on Windows setup)  

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

## 🌐 API Endpoints (Postman‑Ready)

Use Postman, Insomnia, or any REST client to test the API.

**Base URL:**  
http://localhost:8080/api/projects

---

### 🟦 GET — Retrieve all projects
**Method:** GET  
**URL:** `/api/projects`

Returns an array of all stored projects.

---

### 🟩 POST — Create a new project
**Method:** POST  
**URL:** `/api/projects`

**Headers:**  
Content-Type: application/json

**Body (raw JSON):**  
{ "name": "Portfolio Tracker", "description": "Tracks projects for my dev portfolio", "status": "IN_PROGRESS" }

**Expected Response:**  
A JSON object containing the newly created project with an assigned `id`.

---

### 🟧 PUT — Update an existing project  
**IMPORTANT:** PUT requests *must* include both:  
- A valid JSON body  
- The header `Content-Type: application/json`  
Otherwise Spring Boot returns **415 Unsupported Media Type**.

**Method:** PUT  
**URL:** `/api/projects/{id}`  
Example: `/api/projects/1`

**Headers:**  
Content-Type: application/json

**Body (raw JSON):**  
{ "name": "Portfolio Tracker", "description": "Updated description", "status": "COMPLETE" }

**Expected Response:**  
The updated project object with the same `id`.

---

### 🟥 DELETE — Remove a project
**Method:** DELETE  
**URL:** `/api/projects/{id}`  
Example: `/api/projects/1`

**Expected Response:**  
204 No Content

---

### 🗄️ H2 Database Console
**URL:**  
http://localhost:8080/h2-console

**Login Settings:**  
JDBC URL: `jdbc:h2:mem:testdb`  
User: `sa`  
Password: *(leave blank)*

**Example Query:**  
SELECT * FROM PROJECT;


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






