package Enum_06;

public class ArithmeticCalculator {
    private final int a;
    private final int b;

    public ArithmeticCalculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void calculate(Operation operator) {
        switch (operator) {
            case ADD -> System.out.println("Сложение: " + (a + b));
            case SUBTRACT -> System.out.println("Вычитание: " + (a - b));
            case MULTIPLY -> System.out.println("Умножение: " + (a * b));
        }
    }
}