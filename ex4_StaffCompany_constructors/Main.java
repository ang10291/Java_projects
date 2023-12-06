public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andrey", 9876);
        Employee employee2 = new Employee("Anna", "anna@corp.com");
        Employee employee3 = new Employee("Stas", 3456, "stas@employee.com");

        System.out.println(employee1.printInfo());
        System.out.println(employee2.printInfo());
        System.out.println(employee3.printInfo());
    }

}

