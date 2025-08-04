# Java-Console-Calculator
 A simple Java-based console calculator that allows a user to perform basic arithmetic operations like addition, subtraction, multiplication, and division repeatedly, using the result of previous operations.


---

 Features:

- The application  takes the first number as the starting point
- Performs operations based on user choice:
    - Addition
    - Subtraction
    - Multiplication
    - Division (with divide-by-zero protection)
- Stores the result of each operation as the starting point for the next
- Allows continuous calculation until the user chooses to exit
- It also handle the divide by zero and gives the proper message to user
- It also handle the inputMismatch exception ,if the user enters any input other than Number initially.

 Project Structure:

Calculator.java -> Main class to run the calculator loop
CalculatorFunctions.java -> Contains methods for all arithmetic operations



Example: 

Please enter the first number :
5
You can perform the following operations :
1.Addition
2.Subtraction
3.Multiplication
4.Division
5.Exit
Please enter the input from 1 - 5 to perform the operations :
1
Please enter the number to add
5
Total answer = 10.0



-If the user tries to divide by zero, the program will display a proper message.

-You can continuously perform the calculations until the user exits.
- It also handle the inputMismatch exception ,if the user enters any input other than Number initially,it shows proper message.

