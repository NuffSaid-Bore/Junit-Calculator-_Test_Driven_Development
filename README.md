# Calculator Project - Test Driven Development (TDD)

##  Overview

This project demonstrates the principles of Test Driven Development (TDD) using Java. The project implements a simple calculator with the ability to add and multiply numbers, following a TDD approach.

The calculator supports the following functionality:

1. Addition of two integers.
2. Addition of multiple integers.
3. Multiplication of two integers.
4. Multiplication of multiple integers.


## Requirements
- Java 8 or higher
- JUnit (for testing)
- An IDE such as IntelliJ IDEA or Eclipse


## Steps for TDD
- Write Unit Tests: Begin by writing the unit tests for the functionality you want to implement (addition and multiplication).
- Run Tests: Initially, the tests will fail since the actual functionality is not implemented yet.
- Implement the Code: Write the minimal code necessary to make the tests pass.
- Refactor: After the tests pass, refactor the code to improve clarity and maintainability.

## Project Structure
Calculator/
│
├── src/
│   ├── main/com/java/junit/Calculator.java         
│   └── test/com/java/junit/CalculatorTest.java     
│
└── README.md        

## Functionality

1. Add Function
The add function allows you to add two integers or multiple integers. It supports the following examples:
- add(1, 2)      // returns 3
- add(-1, -1)    // returns -2
- add(1, 2, 3, 4, 5)  // returns 15


2.  Multiply Function
The multiply function allows you to multiply two integers or multiple integers. It supports the following examples:
- multiply(1, 3)       // returns 3
- multiply(-1, 3)      // returns -3
- multiply(1, 2, 3, 4, 5)  // returns 120


## Test Coverage
The project includes unit tests for both the add and multiply methods. These tests check the following cases:

- Adding or multiplying two numbers.
- Adding or multiplying multiple numbers.
- Handling positive and negative numbers.


## Screenshots

1. Add two Positive Numbers Test
  <img src="https://github.com/user-attachments/assets/80ebbaaa-6885-4b74-b11d-d1f9c3b90494" style="vertical-align:middle;" /> 
  <img src="https://github.com/user-attachments/assets/46342e11-3b03-4d37-9e55-c4f71d1aea18" style="vertical-align:middle;" />


2. Add two Negative Number Test
  <img src="https://github.com/user-attachments/assets/556b3820-9605-4eab-ac65-e2d343e3c149" style="vertical-align:middle;" /> 
  <img src="https://github.com/user-attachments/assets/d0b66765-29bc-4188-adfa-eb8cb68b7a8e" style="vertical-align:middle;" />


3. Add Multiple positive numbers Test
   <img src="https://github.com/user-attachments/assets/775df5cc-c0b6-4c54-934c-ea9209b011c4" style="vertical-align:middle;" /> 
   <img src="https://github.com/user-attachments/assets/65459edc-45c0-4dfd-9b11-c6ff5f49bdd0" style="vertical-align:middle;" />


4. Multiply two Positive numbers Test
   <img src="https://github.com/user-attachments/assets/d614b931-0658-4162-aa42-9ecaa9007372" style="vertical-align:middle;" /> 
   <img src="https://github.com/user-attachments/assets/be6ef7c0-dd78-4dfc-b962-e42d25ebeb05" style="vertical-align:middle;" />


5. Multiply two Negative Numbers Test
   <img src="https://github.com/user-attachments/assets/fe7998d9-35d4-4d25-bdcf-fbfd41a8c216" style="vertical-align:middle;" /> 
   <img src="https://github.com/user-attachments/assets/97b5543b-4bfe-42c1-b7a3-4e8adfb71d05" style="vertical-align:middle;" />
   

6. Multiply Multiple positive numbers Test
   <img src="https://github.com/user-attachments/assets/dbea90aa-a823-4613-b31c-dcd69704eb43" style="vertical-align:middle;" /> 
   <img src="https://github.com/user-attachments/assets/887ea52d-8ae5-47f5-bb09-f9f70b8b068b" style="vertical-align:middle;" />

## All Tests Passed
  <img src="https://github.com/user-attachments/assets/4d695f65-64b2-4f5d-a31d-d74103765564" style="vertical-align:middle;" /> 

## Summary
This project provides an introduction to Test Driven Development (TDD) by implementing a simple calculator that supports adding and multiplying multiple numbers. The process includes writing tests, implementing the functionality, and refactoring the code to ensure clarity and maintainability. By following TDD principles, you ensure that your code is thoroughly tested and reliable.
