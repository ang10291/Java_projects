package ArraysWorks_10;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();

    public void add(String todo) {
        todoList.add(todo);
        System.out.println("Добавлено дело - " + todo);
    }

    public void add(int index, String todo) {
        if (todoList.size() > index && index >= 0) {
            todoList.add(index, todo);
            System.out.println("Добавлено дело - " + todo);
        }
    }

    public void edit(int index, String todo) {
        if (todoList.size() > index && !todoList.isEmpty()) {
            todoList.set(index, todo);
            System.out.println("Дело " + todoList.get(index) + " заменено на " + todo);
        }
    }

    public void delete(int index) {
        if (todoList.size() > index && !todoList.isEmpty()) {
            todoList.remove(index);
            System.out.println("Дело " + todoList.get(index) + " удалено");
        } else System.out.println("Дело с таким номером не существует");
    }

    public ArrayList<String> getTodos() {
        return new ArrayList<>(todoList);
    }
}
