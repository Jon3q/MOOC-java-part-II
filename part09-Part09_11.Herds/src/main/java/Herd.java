import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable{
    private ArrayList<Movable> array;
    public Herd(){
        array = new ArrayList<>();
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable movable : array){
            movable.move(dx, dy);
        }
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (Movable movable : array) {
            sb.append(movable.toString()).append("\n");
        }
        return sb.toString();
    }
    public void addToHerd(Movable movable){
        array.add(movable);
    }


}
