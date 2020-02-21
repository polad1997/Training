package patterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PoladA
 * @Date&Time 1/29/2020 15:46
 */
public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Item item1 = new Item("1234", 10);
        List<Item> itemList = new ArrayList<>();
        itemList.add(item1);
        Item item2 = new Item("567polad8", 40);
        itemList.add(item2);

        cart.pay(new PaypalStrategy("adasd", "asdad"));
        cart.pay(new CreditCardStrategy("Pankaj Kumar", "1234567890123456", "786", "12/15"));

    }
}
