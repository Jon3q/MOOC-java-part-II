import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {

    private Map<String, Item> map;
    public ShoppingCart() {
        map = new HashMap<>();
    }

    public void add(String product, int price){
        if (!map.containsKey(product)){
            Item added = new Item(product, 1, price);
            map.put(product, added);
        }
        else {
            map.get(product).increaseQuantity();
        }
    }

    public int price(){
        int totalPrice = 0;
        for (Item item : map.values()) {
            totalPrice += item.price(); // Assuming getPrice() returns the price of the item
        }
        return totalPrice;
    }

    public void print(){
        for(Item item : map.values()){
            System.out.println(item);
        }
    }
}
