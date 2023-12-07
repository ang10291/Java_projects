public class Arithmetic {
    private final int a;
    private final int b;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int sum() {
        return a + b;
    }
    public int product() {
        return a * b;
    }
    public int max() {
        return Math.max(a, b);
    }
    public int min() {
        return Math.min(a, b);
    }
}
