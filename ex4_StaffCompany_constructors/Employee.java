public class Employee {
    private final String name;
    private int phoneNum;
    private String email = "не задан";

    public Employee(String name, int phoneNum) {
        this.name = name;
        this.phoneNum = phoneNum;
    }

    public Employee(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Employee(String name, int phoneNum, String email) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.email = email;
    }

    public String printInfo() {
        return "Имя: " + name + "\n" +
                "E-mail: " + email + "\n" +
                "Номер: " + (phoneNum > 0 ? phoneNum : "не задан") + "\n";
    }
}
