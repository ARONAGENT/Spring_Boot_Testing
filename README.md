# 🧪 Spring Boot Testing Project

[![Java](https://img.shields.io/badge/Java-21-orange.svg)](https://www.oracle.com/java/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen.svg)](https://spring.io/projects/spring-boot)
[![Maven](https://img.shields.io/badge/Maven-3.9+-blue.svg)](https://maven.apache.org/)
[![JUnit](https://img.shields.io/badge/JUnit-5-green.svg)](https://junit.org/junit5/)
[![Mockito](https://img.shields.io/badge/Mockito-5.x-red.svg)](https://site.mockito.org/)
[![TestContainers](https://img.shields.io/badge/TestContainers-1.19+-purple.svg)](https://testcontainers.com/)
[![Docker](https://img.shields.io/badge/Docker-Required-blue.svg)](https://www.docker.com/)
[![License](https://img.shields.io/badge/License-MIT-yellow.svg)](#-license)

## 🚀 Overview

This project focuses on implementing various testing methodologies in a Spring Boot application. The project demonstrates comprehensive testing strategies including unit tests, integration tests, and advanced mocking techniques to ensure code reliability and robustness.

---

## 📚 Topics I Learned

### 1. **Unit Testing With JUnit 5**
   - Writing comprehensive unit tests for service and repository layers
   - Mastering `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, and `@AfterAll` annotations
   - Understanding test lifecycle management

### 2. **Integration Testing With Spring Boot**
   - Testing API endpoints using `@SpringBootTest`
   - Validating HTTP response status and payloads
   - Database integration testing strategies

### 3. **Advanced Mocking With Mockito**
   - Mocking service dependencies to isolate test cases
   - Utilizing `@Mock`, `@InjectMocks`, and `@MockBean` annotations
   - Argument capturing and verification techniques

### 4. **REST API Testing With MockMvc**
   - Performing GET, POST, PUT, and DELETE requests
   - Verifying HTTP responses and JSON content
   - Testing security and validation layers

### 5. **Test Coverage Analysis**
   - Generating comprehensive test coverage reports
   - Using Jacoco for detailed code analysis
   - Understanding coverage metrics and improvement strategies

### 📝 **Study Notes**
Detailed notes available: [Spring Boot Testing.pdf](https://github.com/user-attachments/files/19169944/Spring.Boot.Testing.pdf)

---

## 🖼️ Execution Screenshots & Videos

### **Unit Testing (JUnit 5) 🎯**

#### 1. First Test 😉
![00 firstTest](https://github.com/user-attachments/assets/d83f2b66-54c7-4be5-b47f-6773257dfcfc)

#### 2. Display Name Annotation 🏷️
![01 @DisplayName](https://github.com/user-attachments/assets/ffec7ed4-edb6-4364-8435-d7f1015d3534)

#### 3. Disabled Test Cases ❌
![02 @Disabled](https://github.com/user-attachments/assets/1ef0fd38-0b88-4594-91fb-8c85a37826c1)

#### 4. Before Each After Each Lifecycle 🔄
![03 BeforeEach AfterEach](https://github.com/user-attachments/assets/cf7577ea-498d-40e0-bf46-0d29a0f736ba)

#### 5. Before All After All Setup 🌍
![04 BeforeAll AfterAll](https://github.com/user-attachments/assets/c166bb0e-c58f-4221-b99c-604e3d90413c)

#### 6. JUnit Assertions Power ✅
![05 JunitAssertion](https://github.com/user-attachments/assets/8696a757-edd0-45c4-87c4-1e20120078e8)

#### 7. Failed JUnit Assertions ❌
![06 FailedJunitAssertions](https://github.com/user-attachments/assets/c7f27234-91d0-466d-a598-f60008ca29d5)

#### 8. AssertJ For Integers 🔢
![07 UsingAssertJ(Integer)](https://github.com/user-attachments/assets/5d3058ef-52ad-4097-8f85-f0eacd2ed923)

#### 9. AssertJ For Strings 📝
![08 UsingAssertJfor(String)](https://github.com/user-attachments/assets/f6d3b20d-8d4c-4ed6-9a94-885c4a758e73)

#### 10. AssertJ Collection & Boolean Testing 📋
![09 AssertJofType(list and boolean)](https://github.com/user-attachments/assets/2f45bea2-efb7-41ed-be49-c36109d5f528)

#### 11. AssertJ Correct Exception Handling ✅
![10 AssertJGivingCorrectException](https://github.com/user-attachments/assets/a0e914b5-7bc0-49e2-a46f-3c91891337e8)

#### 12. AssertJ Wrong Exception Handling ❌
![11 AssertJGivingWrongException](https://github.com/user-attachments/assets/649b7b90-fb86-424e-a3bc-08b4422100b8)

---

### **Test Container Setup With Docker 🐳**

#### Initially: In-Memory Testing Configuration 💾
![00 ConfigureInMemoryforTesting Using @DataJpaTest](https://github.com/user-attachments/assets/248d8cf5-6752-47e7-90b0-315928337cbf)

#### Advanced: TestContainers With Docker 🚢

https://github.com/user-attachments/assets/ed28adc7-f694-4e73-941c-4350481be1e3

---

### **Integration Testing (SpringBootTest) 🔗**

#### Full Application Context Testing 🏗️
![00 integration testing](https://github.com/user-attachments/assets/dd4fd40d-0c4a-4b2c-b050-8dd18b718f3a)

---

### **Advanced Mocking With Mockito 🎭**

#### 1. Service Layer Mocking 🔧
![01 mockingofServiceLayer](https://github.com/user-attachments/assets/f1971712-d80e-4a3a-9062-0968a439a2ba)

#### 2. Assert And Verify Methods 🔍
![02 assertandverifymethods()](https://github.com/user-attachments/assets/54556e1f-8f8b-4f52-9ae7-5a0fe3ed0b56)

#### 3. Argument Capture Techniques 🎯
![03 ArgumentCapture](https://github.com/user-attachments/assets/7301f8f1-5f3d-4271-8da2-159f7188d240)

---

### **Test Coverage Reports 📊**

#### 1. Basic Coverage Report 📈
![04 CoverageReport](https://github.com/user-attachments/assets/101fa945-e2b2-4554-b067-26e9ccd6f007)

#### 2. Successful Coverage Rate 🏆
![04 successfullRateUsingCoverageRun](https://github.com/user-attachments/assets/bc37468f-43b4-4803-8713-4b0a211ec069)

#### 3. IntelliJ Report Generation 🧠
![05 IntellijReportGeneration](https://github.com/user-attachments/assets/41e3962f-be2d-4e61-9c1f-75b7ff239c29)

#### 4. Jacoco Report Generation 📋
![06 Jacoco Report Generation](https://github.com/user-attachments/assets/dd05a60d-2e7e-4879-b1c9-05add2099777)

#### 5. Detailed Jacoco Analysis 🔍
![07 Jacoco More](https://github.com/user-attachments/assets/d685bbb7-62e4-476d-bb10-e06d406d21ea)

#### 6. Jacoco Code Coverage Visualization 👀
![08 Jacoco More We can see code aswell](https://github.com/user-attachments/assets/bc1bd58f-1890-4afb-9629-45982f2bc285)

---
## 🛠️ Dependencies Used

I use the following key dependencies in this project:

- **ModelMapper** - Object mapping and transformation between DTOs and entity models
- **WebFlux** - Reactive programming support for testing asynchronous API calls
- **TestContainers** - Lightweight, disposable database instances for integration testing
- **MySQL Driver** - Database interactions for repository layer testing
- **JUnit 5** - Modern testing framework for Java applications
- **Mockito** - Mocking framework for unit testing
- **AssertJ** - Fluent assertion library for better test readability

## 🚀 How To Run The Project

### Prerequisites 📋
- **Java 21** or higher
- **Maven 3.9+**
- **Docker** (for TestContainers)
- **IntelliJ IDEA** (recommended)

### Installation Steps 🛠️

1. **Clone the repository:**
   ```bash
   git clone https://github.com/ARONAGENT/Spring_Boot_Testing.git
   cd Spring_Boot_Testing
   ```

2. **Build the project using Maven:**
   ```bash
   mvn clean install
   ```

3. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

4. **Execute tests:**
   ```bash
   # Run all tests
   mvn test
   
   # Run tests with coverage
   mvn clean test jacoco:report
   ```

5. **Generate test reports:**
   ```bash
   # Generate Jacoco coverage report
   mvn jacoco:report
   
   # Open target/site/jacoco/index.html in browser
   ```

---

## 📈 Roadmap  

<details>  
<summary><b>🧪 Spring Boot Testing Progress</b></summary>  

### ✅ Version 1.0 (Completed)  

- [x] **📝 Unit Testing with JUnit 5**  
  - Comprehensive unit tests for service & repository layers  
  - Mastered `@Test`, `@BeforeEach`, `@AfterEach`, `@BeforeAll`, `@AfterAll`  
  - Clear understanding of test lifecycle management  

- [x] **🔗 Integration Testing with Spring Boot**  
  - API endpoint testing using `@SpringBootTest`  
  - Validated HTTP responses & payloads  
  - Implemented database integration test strategies  

- [x] **🎭 Advanced Mocking with Mockito**  
  - Mocked service dependencies for isolated test cases  
  - Used `@Mock`, `@InjectMocks`, `@MockBean` effectively  
  - Applied argument capturing & verification techniques  

- [x] **🌐 REST API Testing with MockMvc**  
  - Performed GET, POST, PUT, DELETE request tests  
  - Verified HTTP responses & JSON content  
  - Covered security & validation testing  

- [x] **📊 Test Coverage Analysis**  
  - Generated reports with Jacoco  
  - Analyzed coverage metrics  
  - Improved code coverage systematically  

### 🔜 Version 2.0 (Next)  

- [ ] **⚡ Performance Testing**: Load & stress testing for APIs  
- [ ] **🔐 Security Testing**: JWT, OAuth, and role-based access checks  
- [ ] **🚀 CI/CD Integration**: Automated test execution in pipelines  
- [ ] **🧩 Contract Testing**: Ensuring API compatibility across microservices  

</details>  

---

## 📄 License
```
Copyright (c) 2024 ARONAGENT

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software")...
```

---

## 🐛 Issues & Support

Need help or found a bug?

- **🐛 Report Bugs**: [Create Issue](https://github.com/ARONAGENT/Spring_Boot_Testing/issues/new?template=bug_report.md)
- **💡 Feature Requests**: [Request Feature](https://github.com/ARONAGENT/Spring_Boot_Testing/issues/new?template=feature_request.md)
- **📧 Direct Contact**: [rohanuke1@gmail.com](mailto:rohanuke1@gmail.com)

---
**Built with ❤️ by [ARONAGENT](https://github.com/ARONAGENT)**
<br>
<br>
