public class Calculator {
    double num1;
    String operator;
    double num2;
    public Calculator(double num1, String operator, double num2) {
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
