package PRACTICALWORK_09;

public class PhoneCleanerRegex {
    public static void main(String[] args) {
        String[] phone = {"+7 909 123-45-67", "+7 (909) 1234567", "8-905-1234567", "9-453-1234567",
                "8-905-123", "905-1234567", "8-905-12345672342"};
        String input = phone[0].replaceAll("[^0-9]", "");
        if ((input.length() > 11 || input.length() < 10) ||
                (input.length() == 11 && input.charAt(0) != '7' && input.charAt(0) != '8')) {
            System.out.print("Неверный формат номера ");
        }
        if (input.length() == 10 && input.charAt(0) == '9') {
            input = "7" + input;
        }
        if (input.length() == 11 && input.charAt(0) == '8') {
            input = input.replaceFirst("8", "7");
        }
        System.out.println(input);
    }
}
