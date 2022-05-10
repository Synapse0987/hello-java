import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        float sum = 0;
        MathOperations operator = new MathOperations();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your desired function. +-*/");
        char sign = input.nextLine().charAt(0);
        System.out.println("Enter first number: ");
        float x = input.nextInt();
        System.out.println("Enter second number: ");
        float y = input.nextInt();

        switch (sign){
            case '+' :{
                sum = calculator.addition(x,y);
                break;
            }
            case '-' :{
                sum = calculator.minus(x,y);
                break;
            }
            case '*' :{
                sum = calculator.multiply(x,y);
                break;
            }
            case '/' :{
                sum = calculator.division(x,y);
                break;
            }
        }
        System.out.printf("Result is: " + sum);
    }
}