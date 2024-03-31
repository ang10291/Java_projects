package Collections_11;

import java.util.Scanner;

public class Main {
    static final String WRONGEmail = "wrong command";

    public static void main(String[] args) {
        String text = """
                ADD - add email(s). Example: ADD email, email ...
                LIST - open the list of emails
                """;
        EmailList emails = new EmailList();
        Scanner scanner = new Scanner(System.in);

        System.out.println(text);

        while (true) {
            String input = scanner.nextLine();
            String[] split = input.split("\\s+");
            if (input.equals("0")) {
                break;
            }

            if (split[0].equals("ADD") ) {
                emails.add(input);
            } else if (split[0].equals("LIST")) {
                emails.getSortedEmails();
            } else System.out.println(WRONGEmail);
        }
    }
}

