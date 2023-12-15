package Enum_06;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(56, 12);
        calculator.calculate(Operation.ADD);
        calculator.calculate(Operation.SUBTRACT);
        calculator.calculate(Operation.MULTIPLY);

        NameOperations[] arrName = NameOperations.values();
        System.out.println();
        Arrays.sort(arrName);
        for (NameOperations all : arrName) {
            System.out.println(all);
        }


        Engine engine = new Engine(EngineType.GAS, 600, 19.9);
        Car car = new Car(engine, CarType.CABRIOLET, 1234);

        System.out.println(car.getWeight());
        System.out.println("Тип автомобиля: " + car.getType()
                    + "\nМасса автомобиля: " + car.getWeight()
                    + "\nОбъём двигателя: " + engine.getVolume()
                    + "\nМощность двигателя: " + engine.getPower()
                    + "\nТип двигателя: " + engine.getEngineType()
        );
    }
}
