package ArraysWorks_10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();

        System.out.println("""
                LIST — выводит дела с их порядковыми номерами;
                ADD — добавляет дело в конец списка или дело на определённое место, сдвигая остальные дела вперёд, если указать номер; если указан несуществующий индекс - добавить в конец списка.
                EDIT — заменяет дело с указанным номером; если указан несуществующий индекс - ничего не делать.
                DELETE — удаляет; если указан несуществующий индекс - ничего не делать
                """);

        while(true) {
            System.out.println("Введите команду:");
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();
            String[] split = input.split("\\s");
            String todo = input.substring(input.indexOf(" ")).trim();


            if (split[0].equals("ADD")) {
                if (todo.matches("^[0-9]+.+")) {
                    String number = todo.substring(0, todo.indexOf(" "));
                    int index = Integer.parseInt(number);
                    todo = todo.substring(todo.indexOf(" ")).strip();
                    list.add(index, todo);
                } else list.add(todo);
            } else if (split[0].equals("LIST")) {
                if (list.getTodos().isEmpty()) System.out.println("empty");
                for (int i = 0; i < list.getTodos().size(); i++) {
                    System.out.println(i + " " + list.getTodos().get(i));
                }
            } else if (split[0].equals("EDIT")) {
                int index = Integer.parseInt(todo.substring(0, todo.indexOf(" ")));
                todo = todo.substring(todo.indexOf(" ")).strip();
                list.edit(index, todo);
            }
            else if (split[0].equals("DELETE")) {
                int index = Integer.parseInt(todo);
                list.delete(index);
            }
        }
    }
}
