# 📚 Book Store Management API (Spring Boot)

A simple **Spring Boot RESTful Web Service** for managing a bookstore. This backend application allows clients to perform full **CRUD operations** on book records using HTTP methods. It is ideal for learning REST APIs and backend development with Java and Spring Boot.

---

## ✅ Features

- ➕ Create a new book  
- 📖 Get a list of all books  
- 🔍 Get book details by ID  
- 📝 Update book information  
- ❌ Delete a book by ID  

---

## 📦 Tech Stack

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **MySQL** (or any SQL database)
- **Maven**

---

## 🌐 API Endpoints

| Method | Endpoint           | Description              |
|--------|--------------------|--------------------------|
| GET    | `/books`           | Get all books            |
| GET    | `/books/{id}`      | Get a book by ID         |
| POST   | `/books`           | Create a new book        |
| PUT    | `/books/{id}`      | Update an existing book  |
| DELETE | `/books/{id}`      | Delete a book by ID      |

---

## 🗃️ Data Model

```json
{
  "id": 1,
  "title": "Core Java",
  "author": "Cay S. Horstmann and Gary Cornell",
  "price": 2,995,
  "stockQuantity": 10
}
