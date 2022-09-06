public class Calculator {
    public static void calculator(double paramA, double paramB, char operation) {
        if (operation == '+') {
            System.out.println(paramA + paramB);
        } else if (operation == '-') {
            System.out.println(paramA - paramB);
        } else if (operation == '*') {
            System.out.println(paramA * paramB);
        } else if (operation == '/') {
            System.out.println(paramA / paramB);
        } else {
            System.out.println("Incorrect type of operation");
        }
    }

    public static void main(String[] args) {
        calculator(10, 7, '+');
        calculator(10, 7, '-');
        calculator(10, 7, '*');
        calculator(10, 7, '/');
    }
}




