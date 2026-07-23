# FocusFlow

> A modern productivity and task management backend built with **Spring Boot** and **PostgreSQL**, designed to help users organize tasks while learning real-world backend engineering.

> 🚧 **Project Status:** Under Active Development  
> **Current Version:** `v0.4.0`

---

# 📖 About

FocusFlow is a RESTful backend application that allows users to create, manage, update, and organize daily tasks.

This project is being built completely from scratch while learning modern backend development using **Spring Boot**, **Spring Data JPA**, and **PostgreSQL**.

The primary goal is not only to build a productivity tracker but also to understand how production-grade backend systems are designed using industry best practices.

---

# 📚 Learning Highlights

This project serves as both a productivity application and a backend engineering learning journey.

### Concepts Implemented

- REST APIs
- CRUD Operations
- Layered Architecture
- Spring Boot
- Spring Data JPA
- Hibernate ORM
- PostgreSQL Integration
- DTO Pattern
- Bean Validation (Jakarta Validation)
- Request Validation using `@Valid`
- Custom Exceptions
- Global Exception Handling
- Environment Variables
- Git & GitHub Workflow

---

# ✨ Current Features

- ✅ Create new tasks
- ✅ Retrieve all tasks
- ✅ Retrieve task by ID
- ✅ Update existing tasks
- ✅ Delete tasks
- ✅ Store tasks in PostgreSQL
- ✅ RESTful API using Spring Boot
- ✅ Layered Architecture (Controller → Service → Repository)
- ✅ DTO-based request handling
- ✅ Request validation using Bean Validation
- ✅ Custom validation messages
- ✅ Custom Exception (`TaskNotFoundException`)
- ✅ Global Exception Handling (`@RestControllerAdvice`)
- ✅ Global Validation Exception Handling
- ✅ Proper HTTP 404 responses
- ✅ Proper HTTP 400 responses
- ✅ Automatic ID generation
- ✅ Automatic task creation timestamp
- ✅ Environment variable support for database credentials

---

# 🚀 Upcoming Features

- ⬜ ResponseEntity
- ⬜ Mark task as completed
- ⬜ Task filtering
- ⬜ Pagination
- ⬜ Sorting
- ⬜ Daily productivity tracking
- ⬜ Weekly analytics
- ⬜ Monthly statistics
- ⬜ Dashboard with charts
- ⬜ JWT Authentication
- ⬜ React Frontend
- ⬜ Docker Support
- ⬜ Deployment

---

# 🛠 Tech Stack

## Backend

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- Maven

## Database

- PostgreSQL

## Development Tools

- VS Code
- Git
- GitHub
- Thunder Client

---

# 🏗 Architecture

```text
                HTTP Request
                      │
                      ▼
              TaskController
                      │
                      ▼
               TaskService
                      │
                      ▼
             TaskRepository
                      │
                      ▼
             Hibernate (JPA)
                      │
                      ▼
                PostgreSQL
```

---

# 📂 Project Structure

```text
src
├── main
│   ├── java
│   │   └── com.hemanthkr.focusflow
│   │       ├── controller
│   │       ├── dto
│   │       ├── entity
│   │       ├── exception
│   │       ├── repository
│   │       ├── service
│   │       └── FocusflowApplication.java
│   │
│   └── resources
│       └── application.properties
│
└── test
```

---

# ⚙️ Getting Started

## Prerequisites

- Java 21+
- Maven
- PostgreSQL

---

## Clone the Repository

```bash
git clone https://github.com/hemanthkumara289/FocusFlow.git
cd FocusFlow
```

---

## Configure Environment Variables

### Windows (PowerShell)

```powershell
setx DB_URL "jdbc:postgresql://localhost:5432/focusflow"
setx DB_USERNAME "postgres"
setx DB_PASSWORD "your_password"
```

Restart your terminal after setting the environment variables.

---

## Run the Application

```bash
./mvnw spring-boot:run
```

Application starts at

```
http://localhost:8080
```

---

# 📡 REST API

| Method | Endpoint | Description |
|---------|----------|-------------|
| POST | `/tasks` | Create Task |
| GET | `/tasks` | Get All Tasks |
| GET | `/tasks/{id}` | Get Task By ID |
| PUT | `/tasks/{id}` | Update Task |
| DELETE | `/tasks/{id}` | Delete Task |

---

# ➕ Create Task

### Request

```http
POST /tasks
```

```json
{
    "title": "Study Spring Boot",
    "taskDate": "2026-07-15",
    "weight": 50
}
```

### Response

```json
{
    "id": 1,
    "title": "Study Spring Boot",
    "completed": false,
    "taskDate": "2026-07-15",
    "weight": 50,
    "createdAt": "2026-07-15T10:30:00"
}
```

---

# 📄 Get Task By ID

### Request

```http
GET /tasks/1
```

### Response

```json
{
    "id": 1,
    "title": "Study Spring Boot",
    "completed": false,
    "taskDate": "2026-07-15",
    "weight": 50,
    "createdAt": "2026-07-15T10:30:00"
}
```

---

# ✏️ Update Task

### Request

```http
PUT /tasks/1
```

```json
{
    "title": "Study Spring Boot Validation",
    "taskDate": "2026-07-23",
    "weight": 90
}
```

### Response

```json
{
    "id": 1,
    "title": "Study Spring Boot Validation",
    "completed": false,
    "taskDate": "2026-07-23",
    "weight": 90,
    "createdAt": "2026-07-15T10:30:00"
}
```

---

# 🗑 Delete Task

### Request

```http
DELETE /tasks/1
```

### Response

```http
200 OK
```

---

# ❌ Error Responses

## Task Not Found

```http
GET /tasks/999
```

Response

```http
404 Not Found
```

```text
Task with id 999 not found
```

---

## Validation Error

```http
POST /tasks
```

```json
{
    "title": "",
    "taskDate": null,
    "weight": 101
}
```

Response

```http
400 Bad Request
```

```json
{
    "title": "Title cannot be blank",
    "taskDate": "Task date is required",
    "weight": "Weight cannot exceed 100"
}
```

---

# 📌 Current Progress

| Feature | Status |
|----------|--------|
| Spring Boot Setup | ✅ |
| PostgreSQL Integration | ✅ |
| Task Entity | ✅ |
| Repository Layer | ✅ |
| Service Layer | ✅ |
| Controller Layer | ✅ |
| DTO Pattern | ✅ |
| Create Task API | ✅ |
| Get All Tasks API | ✅ |
| Get Task By ID API | ✅ |
| Update Task API | ✅ |
| Delete Task API | ✅ |
| Request Validation | ✅ |
| Custom Exception | ✅ |
| Global Exception Handling | ✅ |
| ResponseEntity | ⏳ |
| Authentication | ⏳ |
| React Frontend | ⏳ |

---

# 🗺 Roadmap

- [x] Spring Boot Project Setup
- [x] PostgreSQL Integration
- [x] Create Task API
- [x] Get All Tasks API
- [x] Get Task By ID API
- [x] Update Task API
- [x] Delete Task API
- [x] Request Validation
- [x] Custom Exception Handling
- [x] Global Exception Handling
- [ ] ResponseEntity
- [ ] Task Completion API
- [ ] Pagination & Sorting
- [ ] Analytics Module
- [ ] JWT Authentication
- [ ] React Frontend
- [ ] Docker
- [ ] Deployment

---

# 🎯 Project Goals

- Build a production-style Spring Boot backend.
- Learn backend engineering from first principles.
- Follow REST API best practices.
- Write clean, maintainable code.
- Apply SOLID principles wherever appropriate.
- Build a scalable productivity tracker.

---

# 👨‍💻 Author

## Hemanth Kumara R

Computer Science Engineering Student

**Backend Development • Java • Spring Boot • PostgreSQL**

GitHub

https://github.com/hemanthkumara289

---

# ⭐ Support

If you found this project useful, consider giving it a ⭐ on GitHub.

Feedback, suggestions, and contributions are always welcome.

---

## 🚧 Project Status

FocusFlow is actively under development.

Each feature is implemented while learning modern backend development concepts, making this repository both a productivity application and a documented learning journey into Spring Boot and backend engineering.