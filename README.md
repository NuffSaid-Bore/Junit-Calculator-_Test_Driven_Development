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
add(1, 2)      // returns 3
add(-1, -1)    // returns -2
add(1, 2, 3, 4, 5)  // returns 15


2.  Multiply Function
The multiply function allows you to multiply two integers or multiple integers. It supports the following examples:
multiply(1, 3)       // returns 3
multiply(-1, 3)      // returns -3
multiply(1, 2, 3, 4, 5)  // returns 120


## Test Coverage
The project includes unit tests for both the add and multiply methods. These tests check the following cases:

- Adding or multiplying two numbers.
- Adding or multiplying multiple numbers.
- Handling positive and negative numbers.


## Screenshots

## Summary
This project provides an introduction to Test Driven Development (TDD) by implementing a simple calculator that supports adding and multiplying multiple numbers. The process includes writing tests, implementing the functionality, and refactoring the code to ensure clarity and maintainability. By following TDD principles, you ensure that your code is thoroughly tested and reliable.
