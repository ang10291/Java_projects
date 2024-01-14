package primitive_07;

public class Container2 {
    private Integer count;

    public Container2(Integer count) {
        this.count = count;
    }

    public void addCount(int value) {
        count = count + value;
    }

    public int getCount() {
        return count;
    }
}
