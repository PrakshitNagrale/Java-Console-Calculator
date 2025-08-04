import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double initialValue=0;



        boolean validInput = true;

        //to check for input mismatch ,if user put any input other than number
        while(validInput){
            System.out.println("Please enter the first number : ");

            if(sc.hasNextDouble()){
                initialValue  = sc.nextDouble();
                validInput = false;

            }
            else{
                System.out.println("Invalid input ,try again");
                sc.next();
            }

        }



        CalculatorFunctions calculatorFunctions = new CalculatorFunctions(initialValue,sc);

        boolean calculation=true;

        while(calculation){


            System.out.println("You can perform the following operations : ");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Multiplication");
            System.out.println("4.Division");
            System.out.println("5.Exit");

            System.out.println("Please enter the input from 1 - 5 to perform the operations :");
            int operation = sc.nextInt();

            switch (operation){

                case 1:
                    System.out.println("Total answer = "+ calculatorFunctions.addition());
                    break;
                case 2:
                    System.out.println("Total answer  = "+ calculatorFunctions.subtraction());
                    break;
                case 3:
                    System.out.println("Total answer  = "+ calculatorFunctions.multiplication());
                    break;

                case 4:
                    System.out.println("Total answer  = "+ calculatorFunctions.division());
                    break;
                case 5:

                    System.out.println("Total answer = "+ calculatorFunctions.getTotalSum());
                    System.out.println("Calculator Terminated ");
                    calculation = false;
                    break;

                default:
                    System.out.println("Incorrect Input,Please try again");
            }


        }
    }
}
