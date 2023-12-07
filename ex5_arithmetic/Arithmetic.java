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
<<<<<<< HEAD
    public int product() {
        return a * b;
=======
    public void product() {
        int product = a * b;
        System.out.println(product);
>>>>>>> 417f47fae2310cf9d934b9f657b2bcb3f8c4e218
    }
    public int max() {
        return Math.max(a, b);
    }
<<<<<<< HEAD
    public int min() {
        return Math.min(a, b);
=======
    public void min() {
        System.out.println(Math.min(a, b));
>>>>>>> 417f47fae2310cf9d934b9f657b2bcb3f8c4e218
    }
}
