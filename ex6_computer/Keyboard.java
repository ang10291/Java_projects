package PracticalWork_06;

public record Keyboard(String type, boolean light, double weight) {

    @Override
    public String toString() {
        return "\n type=" + type +
                "\n light=" + light +
                "\n weight=" + weight;
    }
}
