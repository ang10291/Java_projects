import java.util.ArrayList;
import java.util.List;

public class Staff {
    private String name;
    private int age;
    private String position;
    private String salary;

    public Staff(String name, int age, String position, String salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPosition() {
        return position;
    }

    public String getSalary() {
        return salary;
    }
    public static void main(String[] args) {
        //todo: List<Map<String,String>>, где каждый элемент list - строка,
        //key в map - название столбца, value в map - значение ячейки

        List<Staff> staffs = new ArrayList<>();
        staffs.add(new Staff("Кирилл", 26, "Middle java dev", "150000 руб"));
        staffs.add(new Staff("Виталий", 28, "Senior java automation QA", "2000$"));
        staffs.add(new Staff("Александр", 31, "junior functional tester", "50000 руб"));
        staffs.add(new Staff("Дементий", 35, "dex-ops", "1500$"));

        // Names of all employees under 30
        System.out.println("Имена всех сотрудников, младше 30:");
        staffs.stream().filter(s -> s.getAge() < 30)
                .map(Staff::getName).forEach(System.out::println);

        // Names of all employees who are paid in rubles
        System.out.println("\nИмена всех сотрудников, получающих зарплату в рублях:");
        staffs.stream().filter(s -> s.getSalary().contains("руб"))
                .map(Staff::getName).forEach(System.out::println);

        // Average age of all staff
        double averageAge = staffs.stream().mapToInt(Staff::getAge)
                        .average().orElse(0);
        System.out.println("\nСредний возраст всех сотрудников: " + averageAge);
    }
}