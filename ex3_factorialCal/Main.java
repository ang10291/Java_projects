import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String text = "Введите число от 1 до 12!";
        System.out.println(text);

        while(true) {
            int fc = new Scanner(System.in).nextInt();
            if (fc <= 1 || fc >= 12) {
                    System.out.println(text);
                    continue;
                }
            System.out.println(fc + "! = " + factorial(fc));
        }
    }
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        } else
            return n * factorial(n -1);
    }
}
