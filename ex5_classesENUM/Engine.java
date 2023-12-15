package Enum_06;

public class Engine {
    private final EngineType engineType;
    private final int power;
    private final double volume;

    public Engine(EngineType engineType, int power, double volume) {
        this.engineType = engineType;
        this.power = power;
        this.volume = volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public int getPower() {
        return power;
    }

    public double getVolume() {
        return volume;
    }
}
