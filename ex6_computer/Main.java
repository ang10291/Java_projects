package PracticalWork_06;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer(
                new Processor(1200, 3000, "Процессор", 3.0),
                new RAM("fd34", 23.4, 33.0),
                new DataStorage("dfd34", "s435SDD", 467, 45.0),
                new Screen(12.6, "dgIPS", "4eTN", "35VA", 2.0),
                new Keyboard("bf46", true, 900));

        while (true) {
            Example value = Example.valueOf(new Scanner(System.in).next());
            switch (value) {
                case COMPUTER -> System.out.println(computer);
                case DATASTORAGE -> System.out.println(computer.getDataStorage());
                case KEYBOARD -> System.out.println(computer.getKeyboard());
                case PROCESSOR -> System.out.println(computer.getProcessor());
                case RAM -> System.out.println(computer.getRam());
                case SCREEN -> System.out.println(computer.getScreen());
            }
        }
    }
}

