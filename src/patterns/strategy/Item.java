package patterns.strategy;

/**
 * @author PoladA
 * @Date&Time 1/29/2020 15:23
 */
public class Item {

    private String upcCode;
    private int price;

    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }

    public String getUpcCode() {
        return upcCode;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "upcCode='" + upcCode + '\'' +
                ", price=" + price +
                '}';
    }
}
