import java.util.Scanner;

public class Calculator {
    public static void main(String args[]){
        double a ,b, total = 0;
        String operator;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two number :");

        try{
            a = sc.nextInt();
            b = sc.nextInt();
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
