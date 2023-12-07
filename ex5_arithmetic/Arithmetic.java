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
    public void product() {
        int product = a * b;
        System.out.println(product);
    }
    public int max() {
        return Math.max(a, b);
    }
    public void min() {
        System.out.println(Math.min(a, b));
    }
}
