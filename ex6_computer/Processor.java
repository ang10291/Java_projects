package PracticalWork_06;

public final class Processor {
    private  final int rate;
    private final int coreCounts;
    private final String producer;
    private final double weight;

    public Processor(int rate, int coreCounts, String producer, double weight) {
        this.rate = rate;
        this.coreCounts = coreCounts;
        this.producer = producer;
        this.weight = weight;
    }

    public int getRate() {
        return rate;
    }

    public int getCoreCounts() {
        return coreCounts;
    }

    public String getProducer() {
        return producer;
    }

    public double getWeight() {
        return weight;
    }
}
