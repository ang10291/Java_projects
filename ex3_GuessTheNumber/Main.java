
public class Main {
    public static void main(String[] args) {
        //TODO: Программа-игра, в которой пользователь угадывает некое число, а программа, если он не угадает, будет сообщать ему, больше или меньше введённое им число, чем загаданное.
        int number = 17;
        int attempt = 1;
        int maxTryCount = 7;

        System.out.println("Угадайте целое число от 0 до 100:");

        while (maxTryCount > attempt) {
            maxTryCount--;
            try {
                String value = new Scanner(System.in).nextLine();
                int n = Integer.parseInt(value);
                if (n < 0 || n > 100) {
                    maxTryCount = maxTryCount + attempt;
                    System.out.println("Ввeдите от 0 до 100:");
                } else if (n == number) {
                    System.out.println("Ураа! Вы угадали!");
                    break;
                } else if (n < number) {
                    System.out.println("Загаданное число больше :(. Попыток осталось " + (maxTryCount - attempt) + "\nПовторите:");
                } else if (n > number) {
                    System.out.println("Загаданное число меньше :(. Попыток осталось " + (maxTryCount - attempt) + "\nПовторите:");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Введите ЦЕЛОЕ ЧИСЛО:");
            }
            if (attempt == maxTryCount) {
                System.err.print("Вы проиграли. Верный ответ: " + number);
            }
        }
    }
}