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
**POST** `/employee`
```json
{
  "name": "Abdur Rahim",
  "designation": "Deployment Engineer",
  "salary": 8000
}
```

### 📄 Get All Employees
**GET** `/employee`

### 🔍 Get Employee by ID
**GET** `/employee/{id}`

### ✏️ Update Employee
**PUT** `/employee/{id}`
```json
{
  "name": "Abdur Rahim",
  "designation": "DevOps Engineer",
  "salary": 9000
}
```

### ❌ Delete Employee
**DELETE** `/employee/{id}`




