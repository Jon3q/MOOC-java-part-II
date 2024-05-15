import java.util.ArrayList;

public class Box implements Packable{
    private double capacity;
    private ArrayList<Packable> list;
    public Box(double capacity){
        this.capacity = capacity;
        this.list = new ArrayList<>();
    }
    public void add(Packable item){
        if (item.weight() + weight() <= this.capacity){
            list.add(item);
        }
    }
    @Override
    public double weight() {
        double totalWeight = 0;
        for (Packable item : this.list) {
            totalWeight = totalWeight + item.weight();
        }
        return totalWeight;
    }
    public String toString(){
        return "Box: "+this.list.size()+" items, total weight " + weight() + " kg";
    }
}
