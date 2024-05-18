import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        double a ,b, total = 0;
        String operator;
        Scanner sc = new Scanner(System.in);

        try{
            System.out.println("Enter first number :");
            a = sc.nextDouble();
            System.out.println("Enter second number :");
            b = sc.nextDouble();
            System.out.println("Enter an operator (+, -, *, /)");

            operator = sc.next();

            switch (operator){
                case "+":
                    total = a+b;
                    break;
                case "-":
                    total = a-b;
                    break;
                case "*":
                    total = a*b;
                    break;
                case "/":
                    total = a/b;
                    break;
                default:
                    System.out.println("Please input valid operator");
            }
            System.out.println("Result: "+total);
        }catch (Exception e){
            System.out.println("Please input valid number");
        }
    }
}
