package Encapsulation;

public final class Cargo {
    private final Dimensions dimensions;
    private final double weight;
    private final String addressDelivery;
    private final boolean turn;
    private final String regNumber;
    private final boolean fragile;

    public Cargo(Dimensions dimensions, double weight, String addressDelivery, boolean turn, String regNumber, boolean fragile) {
        this.dimensions = dimensions;
        this.weight = weight;
        this.addressDelivery = addressDelivery;
        this.turn = turn;
        this.regNumber = regNumber;
        this.fragile = fragile;
    }

    public Cargo setDimensions(Dimensions dimensions) {
        return new Cargo(dimensions, weight, addressDelivery, turn, regNumber, fragile);
    }
    public Dimensions getDimensions() {
        return dimensions;
    }
    public Cargo setWeight(double weight) {
        return new Cargo(dimensions, weight, addressDelivery, turn, regNumber, fragile);
    }
    public double getWeight() {
        return weight;
    }
    public Cargo setAddressDelivery(String addressDelivery) {
        return new Cargo(dimensions, weight, addressDelivery, turn, regNumber, fragile);
    }
    public String getAddressDelivery() {
        return addressDelivery;
    }
    public String getRegNumber() {
        return regNumber;
    }
    public boolean getTurn() {
        return turn;
    }
    public boolean getFragile() {
        return fragile;
    }

    public String toString() {
        return "Габариты: " + dimensions + "\n" +
                "Вес: " + weight + "\n" +
                "Адрес доставки: " + addressDelivery + "\n" +
                "Можно ли переворачивать? " + turn + "\n" +
                "Регистрационный номер: " + regNumber + "\n" +
                "Груз хрупкий? " + fragile;
    }

}
