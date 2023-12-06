public class Main {
    public static void main(String[] args) {
        Users misha = new Users("Misha", -2);
        Users dima = new Users("Dima", 34);
        Users katya = new Users("Katya", 20);

        printUserInfo(misha);
        printUserInfo(dima);
        printUserInfo(katya);
    }

    static void printUserInfo(Users users) {
        System.out.println(users + postfixGenerator(users.getAge()));
    }

    static String postfixGenerator(int age) {
        if (age < 0) {
            return " <-- Возраст не может быть отрицательным";
        }
        if (age % 10 == 1 && age % 100 != 11) {
            return " год";
        } else if ((age % 10 >= 2 && age % 10 <= 4) &&
                !(age % 100 >= 12 && age % 100 <= 14)) {
            return " года";
        } else return " лет";
    }
}

