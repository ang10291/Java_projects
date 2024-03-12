package ArraysWorks_10;

import java.util.ArrayList;

public class TodoList {
    ArrayList<String> todoList = new ArrayList<>();
    public void add(String todo) {
        todoList.add(todo);
        // TODO: добавьте переданное дело в конец списка
    }

    public void add(int index, String todo) {
        if (todoList.size() > index && index >= 0) {
            todoList.add(index, todo);
            System.out.println();
        }
        // TODO: добавьте дело на указаный индекс,
        //  проверьте возможность добавления
    }

    public void edit(int index, String todo) {
        if (todoList.size() > index && !todoList.isEmpty()) {
            todoList.set(index, todo);
        }
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
    }

    public void delete(int index) {
        if (todoList.size() > index && !todoList.isEmpty()) {
            todoList.remove(index);
            System.out.println("Удалено дело: " + index);
        }
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>(todoList);
    }

}
