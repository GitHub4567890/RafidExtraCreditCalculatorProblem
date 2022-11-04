import java.util.Scanner;
public class CalculatorTestRunner {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String exp = scan.nextLine();

        //Calculator
        CalculatorTest calc = new CalculatorTest(exp);
        System.out.println("The result is: " + calc.execute());

    }
}
