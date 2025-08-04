import java.util.Scanner;

public class CalculatorFunctions {

     private double totalSum;  // a variable to hold the calculation answer

    private  Scanner sc ;  //scanner to take input from user

    public CalculatorFunctions(double totalSum, Scanner sc) {
        this.totalSum = totalSum;
        this.sc = sc;
    }

    public double getTotalSum() { //getter method to get the total sum
        return totalSum;
    }

    //to perform addition
    public double addition(){

        System.out.println("Please enter the number to add");
        double num = sc.nextDouble();

       totalSum =totalSum+ num;

       return totalSum;

    }

    //for subtraction
    public double subtraction(){

        System.out.println("Please enter the number to subtract");
        double num = sc.nextDouble();
        totalSum = totalSum-num;
        return totalSum;
    }

    //for multiplication
    public double multiplication(){
        System.out.println("Please enter number to Multiply");
        double num = sc.nextDouble();
        totalSum = totalSum*num;
        return  totalSum;

    }
    //for division
    public double division(){

        System.out.println("Please enter number to divide");
        double num = sc.nextDouble();

        if(num!=0){
           totalSum = totalSum/num;
           return totalSum;
        }
        else{
           System.out.println("Divide by zero is not possible! \nPlease try again!");

        }

        return totalSum;

    }




}
