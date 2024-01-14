package PracticalWork_06;

public record RAM(String type, double volume, double weight) {

    @Override
    public String toString() {
        return "\n type=" + type +
                "\n volume=" + volume +
                "\n weight=" + weight;
    }
}
