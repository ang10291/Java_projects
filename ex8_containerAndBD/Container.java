package TruckAndContainers;

import java.util.Scanner;

public class Container {
    private static int CONTAINERS_IN_TRUCK = 12;
    private static int BOXES_IN_CONTAINER = 27;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Укажите количество коробок: ");
        int boxes = scanner.nextInt();

        int containerCount = boxes / BOXES_IN_CONTAINER + (boxes % BOXES_IN_CONTAINER == 0 ? 0 : 1);
        int truckCount = containerCount / CONTAINERS_IN_TRUCK + (containerCount % CONTAINERS_IN_TRUCK == 0 ? 0 : 1);

        int trucks = 1;
        int containers = 1;
        int boxCount = 1;

        System.out.println("Грузовик: " + trucks);
        System.out.println("\tКонтейнер: " + containers);

        for (int i = 1; i <= boxes; i++) {
            if (boxCount > BOXES_IN_CONTAINER) {
                boxCount = 1;
                containers++;
                System.out.println("\tКонтейнер: " + containers);
            }
            boxCount++;
            if (containers > CONTAINERS_IN_TRUCK) {
                containers = 1;
                trucks++;
                System.out.println("Грузовик: " + trucks);
                System.out.println("\tКонтейнер: " + containers);
            }

            System.out.println("\t\tЯщик: " + i);
        }

        System.out.println("\nНеобходимо:\n\n" +
                "грузовиков - " + truckCount + " шт." + System.lineSeparator() +
                "контейнеров - " + containerCount + " шт.");
    }
}
