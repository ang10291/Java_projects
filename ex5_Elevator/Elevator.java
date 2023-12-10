public class Elevator {
    private int currentFloor;
    private final int minFloor;
    private final int maxFloor;

    public Elevator(int minFloor, int maxFloor) {
        this.minFloor = minFloor;
        this.maxFloor = maxFloor;
        currentFloor = 1;
    }

    public void moveUp() {
        currentFloor++;
    }

    public void moveDown() {
        currentFloor--;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void move(int floor) {
        if (floor < minFloor || floor > maxFloor) {
            System.out.println("Недоступный этаж.");
            return;
        }
        while (floor != currentFloor) {
            if (currentFloor < floor) {
                moveUp();
            } else if (currentFloor > floor) {
                moveDown();
            }
            System.out.println(getCurrentFloor() + " current");
        }

    }
}
