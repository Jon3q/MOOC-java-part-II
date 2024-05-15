import java.util.ArrayList;

public class BoxWithMaxWeight extends Box{
    private ArrayList<Item> items;
    private int maxWeight;
    public BoxWithMaxWeight (int capacity){
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (item.getWeight() <= maxWeight){
            items.add(item);
            maxWeight -= item.getWeight();
        }
    }

    @Override
    public boolean isInBox(Item item) {
        for (int i = 0; i < items.size(); i++){
            if (items.get(i).equals(item)){
                return true;
            }
        }
        return false;
    }
}
