package PracticalWork_06;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new Processor(1200, 3000, "Процессор", 3.0),
                new RAM("fd34", 23.4, 33.0),
                new DataStorage("dfd34", "s435SDD", 467, 45.0),
                new Screen(12.6, "dgIPS", "4eTN", "35VA", 2.0),
                new Keyboard("bf46", true, 900));
        System.out.println(computer);
        System.out.println();
        computer.setKeyboard(new Keyboard("132434", false, 800));
        System.out.println(computer);
    }
}
