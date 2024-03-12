package PRACTICALWORK_09;

import java.util.Scanner;

public class PhoneCleanerRegex {
    static final String mess = "Введите номер телефона:";
    public static void main(String[] args) {
        System.out.println(mess);
        while (true) {
            String sc = new Scanner(System.in).nextLine();
            String input = sc.replaceAll("[^0-9]", "");
            if (input.equals("0")) {
                break;
            }
            if ((input.length() > 11 || input.length() < 10) ||
                    (input.length() == 11 && input.charAt(0) != '7' && input.charAt(0) != '8')) {
                System.out.print("Неверный формат номера ");
            }  if (input.length() == 10 && input.charAt(0) == '9'){
                input = "7" + input;
                System.out.print("Сохранен номер ");
            }  if (input.length() == 11 && input.charAt(0) == '8') {
                input = input.replaceFirst("8", "7");
                System.out.print("Сохранен номер ");
            }  System.out.println(input);
        }
    }
}
