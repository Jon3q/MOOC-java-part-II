import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {

    private Map<String, Integer> map;
    private Map<String, Integer> stocky;

    public Warehouse(){
        map = new HashMap<>();
        stocky = new HashMap<>();
    }
    public void addProduct(String product, int price, int stock){
        map.put(product, price);
        stocky.put(product, stock);
    }

    public int price(String product){
        if (!map.containsKey(product)){
            return -99;
        }
        return map.get(product);
    }

    public int stock(String product){
        if (!stocky.containsKey(product)){
            return 0;
        }
        return stocky.get(product);
    }

    public boolean take(String product){
        Integer value = stocky.get(product);
        if (stocky.containsKey(product)){
            if(stocky.get(product) >= 1){
                stocky.put(product,  value - 1);
                return true;
            }
        }
        return false;
    }

    public Set<String> products(){
        return map.keySet();
    }
}
