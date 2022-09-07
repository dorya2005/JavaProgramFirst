public class CalculatorSwitch {
    public static void calculator(double paramA, double paramB, char operation) {
        double result = 0;
        switch (operation) {
            case '+':
                result = paramA + paramB;
                break;
            case '-':
                result = paramA - paramB;
                break;
            case '*':
                result = paramA * paramB;
                break;
            case '/':
                result = paramA / paramB;
                break;
            default:
                System.out.println("Incorrect operation");


        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        calculator(10, 7, '+');
        calculator(10, 7, '-');
        calculator(10, 7, '*');
        calculator(10, 7, '/');
    }
}




