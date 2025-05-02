class Calculator {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}
public class CalculatorC {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        double num1 = 10;
        double num2 = 5;

        System.out.println(num1 + " + " + num2 + " = " + calc.add(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + calc.subtract(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + calc.multiply(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + calc.divide(num1, num2));
        //System.out.println(num1 + " / 0 = " + calc.divide(num1, 0));
    }
}
