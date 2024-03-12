package PRACTICALWORK_09;

public class SplitText {
    public static void main(String[] args) {
        String text2 = "This is 66 just text,   for an example of how 67 5the program works";
        String[] words = text2.replaceAll("[^!A-Za-z\\s+]", "").split("\\s+");
        for (String a : words) {
            System.out.println(a);
        }


        //TODO другое решение

        String result = text2.replaceAll("[^!A-Za-z\\s+]", "");
        String split = "\\s+";
        System.out.println(result.replaceAll(split, "\n"));
        //return text.replaceAll(split, "\n");

    }
}
