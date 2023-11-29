
public class Main {
    public static void main(String[] args) {
        int f = 1;

        String text = "Введите число от 1 до 12!";
        System.out.println(text);

        while (true) {
            try {
                int number = new Scanner(System.in).nextInt();
                if (number >= 12 || number <= 1) {
                    System.out.println(text);
                    continue;
                }
                for (int i = 1; i <= number; i++) {
                    f *= i;
                }
                System.out.println(number + "! = " /*+ i + " = "*/ + f);
            } catch (Exception e) {
                System.out.println(text);
            }
        }
    }
}