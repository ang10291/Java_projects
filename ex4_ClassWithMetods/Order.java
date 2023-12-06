public class Order {
    private int count = 0;
    private int totalCost = 0;

    public void addProducts(int productCount, int cost){
        count += productCount;
        totalCost += cost;
    }

    public int getCount() {
        return count;
    }

    public int getTotalCost() {
        return totalCost;
    }
}
