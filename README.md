# Spring Boot Testing Project

## Overview
This project focuses on implementing various testing methodologies in a Spring Boot application. The project includes unit tests, integration tests, and mocking techniques to ensure code reliability and robustness.

---
## Dependencies Required

- **ModelMapper** - Used for object mapping and transformation between DTOs and entity models.
- **WebFlux** - Enables reactive programming and is useful for testing asynchronous API calls.
- **Test Containers** - Provides lightweight, disposable database instances for integration testing.
- **MySQL Driver** - Required for database interactions when testing repository layers.

---
## Topics Covered

1. **Unit Testing with JUnit 5**
   - Writing unit tests for service and repository layers.
   - Using `@Test`, `@BeforeEach`, and `@AfterEach` annotations.

2. **Integration Testing with Spring Boot**
   - Testing API endpoints using `@SpringBootTest`.
   - Validating response status and payloads.

3. **Mocking with Mockito**
   - Mocking service dependencies to isolate test cases.
   - Using `@Mock` and `@InjectMocks` annotations.

4. **Testing REST APIs with MockMvc**
   - Performing GET, POST, PUT, and DELETE requests.
   - Verifying HTTP responses and content.

5. **Test Coverage and Reports**
   - Generating test coverage reports.
   - Using tools like Jacoco for analysis.

---
## Execution and Images

### **1. Unit Testing (JUnit 5)**
- Writing and executing test cases for individual methods.

00. firstTest
![00 firstTest](https://github.com/user-attachments/assets/d83f2b66-54c7-4be5-b47f-6773257dfcfc)

01. @DisplayName
![01 @DisplayName](https://github.com/user-attachments/assets/ffec7ed4-edb6-4364-8435-d7f1015d3534)

02. @Disabled
![02 @Disabled](https://github.com/user-attachments/assets/1ef0fd38-0b88-4594-91fb-8c85a37826c1)

03. BeforeEach AfterEach
![03 BeforeEach AfterEach](https://github.com/user-attachments/assets/cf7577ea-498d-40e0-bf46-0d29a0f736ba)

04. BeforeAll AfterAll
![04 BeforeAll AfterAll](https://github.com/user-attachments/assets/c166bb0e-c58f-4221-b99c-604e3d90413c)

05. JunitAssertion
![05 JunitAssertion](https://github.com/user-attachments/assets/8696a757-edd0-45c4-87c4-1e20120078e8)

06. FailedJunitAssertions
![06 FailedJunitAssertions](https://github.com/user-attachments/assets/c7f27234-91d0-466d-a598-f60008ca29d5)

07. UsingAssertJ(Integer)
![07 UsingAssertJ(Integer)](https://github.com/user-attachments/assets/5d3058ef-52ad-4097-8f85-f0eacd2ed923)

08. UsingAssertJfor(String)
![08 UsingAssertJfor(String)](https://github.com/user-attachments/assets/f6d3b20d-8d4c-4ed6-9a94-885c4a758e73)

09. AssertJofType(list and boolean)
![09 AssertJofType(list and boolean)](https://github.com/user-attachments/assets/2f45bea2-efb7-41ed-be49-c36109d5f528)

10. AssertJGivingCorrectException
![10 AssertJGivingCorrectException](https://github.com/user-attachments/assets/a0e914b5-7bc0-49e2-a46f-3c91891337e8)

11. AssertJGivingWrongException
![11 AssertJGivingWrongException](https://github.com/user-attachments/assets/649b7b90-fb86-424e-a3bc-08b4422100b8)

### **2. Integration Testing (SpringBootTest)**
- Testing API endpoints with `@SpringBootTest`.

00. integration testing
![00 integration testing](https://github.com/user-attachments/assets/dd4fd40d-0c4a-4b2c-b050-8dd18b718f3a)

### **3. Mocking with Mockito**
- Using mocks to isolate dependencies and avoid real database calls.

01. mockingofServiceLayer
![01 mockingofServiceLayer](https://github.com/user-attachments/assets/f1971712-d80e-4a3a-9062-0968a439a2ba)

02. assertandverifymethods()
![02 assertandverifymethods()](https://github.com/user-attachments/assets/54556e1f-8f8b-4f52-9ae7-5a0fe3ed0b56)

03. ArgumentCapture
![03 ArgumentCapture](https://github.com/user-attachments/assets/7301f8f1-5f3d-4271-8da2-159f7188d240)

### **4. Test Coverage Reports**
- Generating test coverage statistics using Jacoco.

04. CoverageReport
![04 CoverageReport](https://github.com/user-attachments/assets/101fa945-e2b2-4554-b067-26e9ccd6f007)

04. successfullRateUsingCoverageRun
![04 successfullRateUsingCoverageRun](https://github.com/user-attachments/assets/bc37468f-43b4-4803-8713-4b0a211ec069)

05. IntellijReportGeneration
![05 IntellijReportGeneration](https://github.com/user-attachments/assets/41e3962f-be2d-4e61-9c1f-75b7ff239c29)

06. Jacoco Report Generation
![06 Jacoco Report Generation](https://github.com/user-attachments/assets/dd05a60d-2e7e-4879-b1c9-05add2099777)

07. Jacoco More
![07 Jacoco More](https://github.com/user-attachments/assets/d685bbb7-62e4-476d-bb10-e06d406d21ea)

08. Jacoco More We can see code aswell
![08 Jacoco More We can see code aswell](https://github.com/user-attachments/assets/bc1bd58f-1890-4afb-9629-45982f2bc285)

---
## Conclusion

This project demonstrates best practices for testing a Spring Boot application. By implementing unit tests, integration tests, and mocking techniques, we ensure code quality and reliability. The use of `MockMvc` for API testing and test coverage tools like Jacoco further strengthens the testing process.

Future improvements may include:
- Implementing property-based testing for enhanced test cases.
- Integrating testing in CI/CD pipelines.
- Expanding test scenarios to include performance and security testing.

---
## How to Run the Project
1. Clone the repository:
   ```bash
   git clone https://github.com/ARONAGENT/Spring_Boot_Testing.git
   cd Spring_Boot_Testing
   ```
2. Build the project using Maven:
   ```bash
   mvn clean install
   ```
3. Run the application:
   ```bash
   mvn spring-boot:run
   ```
4. Access the application endpoints and API documentation as per the topics above.

## Prerequisites
- Java 21
- Maven
- IntelliJ IDEA
