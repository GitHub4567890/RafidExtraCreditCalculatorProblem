public class CalculatorTest {
    double num1;
    String operator;
    double num2;
    public CalculatorTest(String exp) {
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

        this.num1 = num1;
        this.operator = operator;
        this.num2 = num2;
    }

    public double execute() {                       //Executes the computation.
        return switch (operator) {                  //Learned a new way to create "if" statements
            case "*" -> num1 * num2;                //(kind-of) while doing this!
            case "/" -> num1 / num2;
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "%" -> num1 % num2;
            case "^" -> Math.pow(num1, num2);
            default -> 0;
        };
    }
}
