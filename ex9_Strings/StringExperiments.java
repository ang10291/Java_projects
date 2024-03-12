package Strings_09;

import java.util.Scanner;

public class StringExperiments {
    public static void main(String[] args) {
        Scanner cs = new Scanner(System.in);
        String first = cs.nextLine().trim();
        String sign = cs.nextLine().trim();
        String second = cs.nextLine().trim();

        int firstInt = Integer.parseInt(first);
        int secondInt = Integer.parseInt(second);

        int result = 0;
        switch (sign) {
            case "+" -> result = firstInt + secondInt;
            case "-" -> result = firstInt - secondInt;
            case "/" -> result = firstInt / secondInt;
            case "*" -> result = firstInt * secondInt;
        }
        System.out.println(result);
    }
}
