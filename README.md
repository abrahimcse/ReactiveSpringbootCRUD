## Project: Employee Management System (Reactive CRUD)


### Stack: 
- Spring Boot, 
- Spring WebFlux, 
- MySQL (R2DBC)

### Schema SQL
```sql
CREATE TABLE employees(
id INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(255),
designation VARCHAR(255),
salary INT
);
```