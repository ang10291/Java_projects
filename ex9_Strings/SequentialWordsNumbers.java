package PRACTICALWORK_09;

public class SequentialWordsNumbers {
    public static void main(String[] args) {
        String text = "Это просто текст, для   примера работы программы  ".strip();
        System.out.println(SequentialWordsNumbers.sequentialWordsNumbers(text));

        int start = 0;
        int number = 1;
        StringBuilder words = new StringBuilder();
        while (start < text.length()) {
            int end = text.indexOf(' ', start);
            if (end < 0) {
                end = text.length();
            }
            String word = text.substring(start, end);
            words.append(" (").append(number).append(") ").append(word);
            start = end + 1;
            number++;
        }
        System.out.println(words);

    }

    public static String sequentialWordsNumbers(String text) {
        int start = 0;
        int number = 1;
        StringBuilder words = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            int end = text.indexOf(' ', start);
            if (end == -1) {
				String word = text.substring(start);
				words.append(" (").append(number).append(") ").append(word);
				break;
            }
            String word = text.substring(start, end);
            words.append(" (").append(number).append(") ").append(word);
            start = end + 1;
            number++;
        }
        return words.toString().trim();
    }
}
