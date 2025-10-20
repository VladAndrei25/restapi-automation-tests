# 🧪 REST API Automation Tests – ReqRes

Automated testing project for the **ReqRes API** using **Java**, **RestAssured**, and **JUnit 5**.  
The goal of this project is to demonstrate CRUD (Create, Read, Update, Delete) operations on a RESTful API.

---

## 🚀 Project Overview

This project validates the functionality of public API endpoints from [reqres.in](https://reqres.in)  
using automated tests written in Java. It focuses on verifying the correctness of HTTP methods,  
status codes, and response payloads.

### ✅ Implemented CRUD Tests

| Operation | HTTP Method | Endpoint | Test Class | Status |
|------------|-------------|-----------|-------------|--------|
| Create User | `POST` | `/api/users` | `CreateUserTest.java` | ✅ |
| Read Users | `GET` | `/api/users?page=2` | `GetUsersTest.java` | ✅ |
| Update User | `PUT` | `/api/users/2` | `UpdateUserTest.java` | ✅ |
| Delete User | `DELETE` | `/api/users/2` | `DeleteUserTest.java` | ✅ |

Each test includes:
- Proper **status code validation**
- **Response body assertions** (using Hamcrest)
- Basic **JSON payloads** for POST and PUT requests

---

## 🧰 Tech Stack
![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![RestAssured](https://img.shields.io/badge/RestAssured-00A98F?style=for-the-badge&logo=testinglibrary&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Hamcrest](https://img.shields.io/badge/Hamcrest-1572B6?style=for-the-badge&logo=checkmarx&logoColor=white)

| Tool / Library | Purpose |
|----------------|----------|
| **Java 17** | Programming language |
| **Maven** | Build automation & dependency management |
| **JUnit 5** | Test framework |
| **RestAssured** | API testing library |
| **Hamcrest** | Assertions and matchers |

---

## ⚙️ Project Structure
```restapi-automation-tests/
├── src/
│ └── test/
│ └── java/
│ └── tests/
│ ├── CreateUserTest.java
│ ├── GetUsersTest.java
│ ├── UpdateUserTest.java
│ └── DeleteUserTest.java
│
├── pom.xml
├── .gitignore
└── README.md
```

---

## 🧪 How to Run the Tests

1. **Clone the repository:**
   ```bash
   git clone https://github.com/VladAndrei25/restapi-automation-tests.git
   cd restapi-automation-tests
   ```
2. **Run tests via Maven:**
   ```bash
   mvn test
   ```
3.**Run a specific test example:**
   ```bash
   mvn -Dtest=CreateUserTest test
   ```

---

## 🧠 Included Test Cases
- CreateUserTest
- DeleteUserTest
- GetUserTest
- UpdateUserTest

---

## 📸 Screenshots
Example of successful test execution in CreateUserTest:
<p align="center">
 <img width="1168" height="125" alt="image" src="https://github.com/user-attachments/assets/4c235ae1-076c-4c9e-88a8-7d036cb1b1a3" />
</p>
Example of succesful test execution in GetUserTest:
<p align="center">
  <img width="1158" height="88" alt="image" src="https://github.com/user-attachments/assets/dbcabed5-cbbc-456c-9654-5af4c08d288e" />
</p>
Example of succesful test execution in UpdateUserTest:
<p align="center">
 <img width="1134" height="100" alt="image" src="https://github.com/user-attachments/assets/21377661-1e4b-4f77-a914-11f17d8094f4" />
</p>
Example of succesful test execution in DeleteUserTest:
<p align="center">
  <img width="1120" height="92" alt="image" src="https://github.com/user-attachments/assets/32bedfb3-8a02-4853-b183-1f604e2b018e" />
</p>

---

## 🎥 Demo – Test Execution

<div align="center">

<img src="testAPIRestAssured.gif" alt="Reqres api test demo" width="80%">

</div>

---

 ## 💡 Future Improvements
 Add request/response logging for better visibility (.log().all())
 
 Integrate with Allure for test reporting

 Parameterize test data
 
 Add negative test scenarios (invalid inputs)
 
 Add CI/CD integration with GitHub Actions

---

### 🧾 License

This project is licensed under the [MIT License](LICENSE)

---

## 👤 Author
Radulescu Vlad Andrei

📧 GitHub Profile: [https://github.com/VladAndrei25]

💬 Feel free to reach out for collaboration or feedback!

---
