import java.util.Scanner;
import java.lang.Math;

class Calculator {
    private  
		double number1;
		double number2;
		double result=0.0;
		Character operator;
        
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        
        Calculator calculator = new Calculator();
        
        System.out.print("Enter First number- ");
        calculator.number1=scan.nextDouble();

        System.out.print("Enter Second number- ");
        calculator.number2=scan.nextDouble();

        System.out.print("Enter the operator (+, -, *, /, ^)- ");
        calculator.operator=scan.next().charAt(0);

        scan.close();
        
        switch (calculator.operator) {
            case '+':
            	calculator.result=addition(calculator.number1,calculator.number2);
                break;
            case '-':
            	calculator.result=subtraction(calculator.number1,calculator.number2);
                break;
            case '*':
            	calculator.result=multiplication(calculator.number1,calculator.number2);
                break;
            case '/':
            	calculator.result=division(calculator.number1,calculator.number2);
                break;
            case '^':
            	calculator.result=power(calculator.number1,calculator.number2);
	    		break;
        }
        System.out.println("The result is- "+calculator.result);
        
    }
    private static double addition(double number1, double number2) {
    	return (number1+number2);
    }
    private static double subtraction(double number1, double number2) {
    	return (number1-number2);
    }
    private static double multiplication(double number1, double number2) {
    	return (number1*number2);
    }
    private static double division(double number1, double number2) {
    	return (number1/number2);
    }
    private static double power(double number1, double number2) {
    	return Math.pow(number1,number2);
    }
}