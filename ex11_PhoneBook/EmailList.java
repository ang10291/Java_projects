package Collections_11;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailList {
    TreeSet<String> emailList = new TreeSet<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // принять решение добавлять аргумент email или нет должен этот метод
        Pattern pattern = Pattern.compile("[\\w]+@.[\\w]+\\.[\\w]{2,3}");
        Matcher matcher = pattern.matcher(email);
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            emailList.add(email.substring(start, end).toLowerCase());
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        for (String emails : emailList) {
            System.out.println(emails);
        }
        return new ArrayList<>(emailList);
    }
}

