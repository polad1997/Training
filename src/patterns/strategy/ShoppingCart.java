package patterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author PoladA
 * @Date&Time 1/29/2020 15:33
 */
public class ShoppingCart {

    List<Item> items;

    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void pay(PaymentStrategy strategy){
        int amount = calculateTotal();
        strategy.pay(amount);
    }

}
