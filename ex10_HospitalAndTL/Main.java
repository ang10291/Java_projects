package ArraysWorks_10;

public class Main {
    public static void main(String[] args) {
        TodoList list = new TodoList();
        list.add("Other");
        list.add("Father");
        list.add("Sister");
        System.out.println(list.todoList);

        list.add(2, "Mom");
        System.out.println(list.todoList);

        list.add(4, "Grandpa");
        list.add(8, "Grandma");
        System.out.println(list.todoList);

        list.delete(2);
        System.out.println(list.todoList);

        list.edit(0, "Me");
        System.out.println(list.todoList);

        System.out.println("\nprint " + list.getTodos());
    }
}
