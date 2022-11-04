import java.util.Scanner;
public class CalculatorRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String exp = scan.nextLine();

        String symbol1 = "*";
        String symbol2 = "/";
        String symbol3 = "+";
        String symbol4 = "-";
        String symbol5 = "%";
        String symbol6 = "^";
        int operatorLocation;

        //Finds the operator symbol in the given expression
        operatorLocation = exp.indexOf(symbol1);

        if (operatorLocation == -1) {
            operatorLocation = exp.indexOf(symbol2);
        }
        if (operatorLocation == -1) {
            operatorLocation = exp.indexOf(symbol3);
        }
        if (operatorLocation == -1) {
            operatorLocation = exp.indexOf(symbol4);
        }
        if (operatorLocation == -1) {
            operatorLocation = exp.indexOf(symbol5);
        }
        if (operatorLocation == -1) {
            operatorLocation = exp.indexOf(symbol6);
        }
        if (operatorLocation == -1) {
            System.out.println("Invalid operator!");
            System.exit(1);
        }

        String operator = exp.substring(operatorLocation, operatorLocation + 1);

        double num1 = 0;
        double num2 = 0;

        //Finds and sets num variables to the corresponding numbers
        try {
            num1 = (double)(Integer.parseInt(exp.substring(0, operatorLocation - 1)));
        } catch (Exception t) {
            num1 = Double.parseDouble(exp.substring(0, operatorLocation - 1));
        }
        try {
            num2 = (double)(Integer.parseInt(exp.substring(operatorLocation + 2)));
        } catch (Exception s) {
            num2 = Double.parseDouble(exp.substring(operatorLocation + 2));
        }

        //Calculator
        Calculator calc = new Calculator(num1, operator, num2);
        System.out.println("The result is: " + calc.execute());

    }
}
