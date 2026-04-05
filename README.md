# Telephone Keypad Letter Combinations

This repository contains a Java-based solution for the Telephone Keypad Letter Combinations coding challenge. It takes a string of digits (2-9) and returns all possible letter combinations those digits could represent, similar to a classic T9 phone keypad.

## Features & Bonus Tasks Completed

* **Optimized Algorithm:** Utilizes a Depth-First Search (DFS) backtracking approach with `StringBuilder` for efficient memory management and string manipulation.
* **Input Validation:** Includes strict regex guard clauses (`^[2-9]{0,4}$`) to handle invalid characters, empty strings, and maximum length constraints safely.
* **Custom Ordering:** The output list is explicitly sorted in reverse-alphabetical order (z to a).
* **Unit Testing:** Includes a comprehensive JUnit 5 test suite covering standard paths, complex inputs (4-letter mapping for 7 and 9), maximum boundaries, and constraint violations.

## Prerequisites
* Java 21 or higher
* The included `.jar` testing framework files and `check.cmd` script in the root directory.

## How to Run the Application

You can compile and run the main program directly from your terminal. 

1. Navigate to the root folder of the project.
2. Compile the code:
   javac telephone/Main.java

3. Run the application:
   java telephone.Main

4. Enter a sequence of digits (e.g., `23`) when prompted.

## How to Run the Unit Tests

The test suite (`MainTest.java`) uses JUnit 5 and the provided functional tester script.

**For Windows (PowerShell):**
Run the following command from the root directory:
.\check.cmd telephone/MainTest.java telephone.MainTest

**For Windows (Command Prompt):**
check.cmd telephone/MainTest.java telephone.MainTest

**For Mac / Linux:**
Ensure the script has execution permissions first, then run it:
chmod +x check.cmd
./check.cmd telephone/MainTest.java telephone.MainTest

## Test Coverage
The `MainTest` suite includes:
* `testEmptyInput()`: Verifies base case handling.
* `testSimpleInput()`: Verifies standard single-digit inputs.
* `testComplexInput()`: Verifies multi-digit mapping and exact reverse-alphabetical sorting.
* `testComplexLength()`: Verifies the algorithm scales to maximum constraints (e.g., 256 combinations for "7979").
* `testOrder()`: Validates that the custom reverse-alphabetical comparator is applied correctly.
* `testInvalidInput()`: Proves the guard clauses correctly handle out-of-bounds digits (0, 1), symbols, and strings exceeding the maximum length.
