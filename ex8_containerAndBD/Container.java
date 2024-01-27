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

        int containers = 1;
        int truck = 1;
        //объяснение: в одном контейнере 27 боксов, а в одном грузовике 12 контейнеров или 324 боксов.
        for (int box = 0; box < boxes; ) {
            if (box % (CONTAINERS_IN_TRUCK * BOXES_IN_CONTAINER) == 0) {
                System.out.println("Грузовик: " + truck);
                truck++;
            }
            if (box % BOXES_IN_CONTAINER == 0) {
                System.out.println("\tКонтейнер: " + containers);
                containers++;
            }
            ++box;
            System.out.println("\t\tЯщик: " + box);
        }
        System.out.println("\nНеобходимо:\n\n" +
                "грузовиков - " + truckCount + " шт." + System.lineSeparator() +
                "контейнеров - " + containerCount + " шт.");
    }
}
