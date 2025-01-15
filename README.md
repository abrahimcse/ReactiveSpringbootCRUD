# Employee Management System (Reactive CRUD)

A **Reactive Employee Management System** built with **Spring Boot**, **Spring WebFlux**, **MySQL (R2DBC)**, and **ModelMapper**. This application supports full **CRUD** operations in a non-blocking, asynchronous way.

---

## Features
- Reactive CRUD operations for Employee management
- MySQL database integration using R2DBC
- Clean code structure with DTO and ModelMapper
- RESTful API with Spring WebFlux


---

## 🛠️ Tech Stack
- **Backend:** Spring Boot, Spring WebFlux
- **Database:** MySQL with R2DBC
- **ORM:** Spring Data R2DBC
- **Mapping:** ModelMapper
- **Build Tool:** Maven

---

## 📮 API Endpoints

### ➕ Create Employee
**POST** `/employees`
```json
{
  "name": "John Doe",
  "designation": "Software Engineer",
  "salary": 60000
}
```

### 📄 Get All Employees
**GET** `/employees`

### 🔍 Get Employee by ID
**GET** `/employees/{id}`

### ✏️ Update Employee
**PUT** `/employees/{id}`
```json
{
  "name": "Abdur Rahim",
  "designation": "Deployment Engineer",
  "salary": 8000
}
```

### ❌ Delete Employee
**DELETE** `/employees/{id}`


---



