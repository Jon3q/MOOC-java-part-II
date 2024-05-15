import java.util.ArrayList;

public class OneItemBox extends Box{

    private ArrayList<Item> items;
    public OneItemBox(){
        items = new ArrayList<>();
    }
    @Override
    public void add(Item item) {
        if (items.isEmpty()){
            items.add(item);
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
