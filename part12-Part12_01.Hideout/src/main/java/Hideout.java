import java.util.ArrayList;

public class Hideout<T> {

    private ArrayList<T> hideout;
    public Hideout(){
        this.hideout = new ArrayList<>();
    }
    public void putIntoHideout(T toHide){
        if(hideout.size() == 1){
            hideout.remove(0);
            hideout.add(toHide);
        } else if (hideout.size() == 0) {
            hideout.add(toHide);
        }
        }

    public T takeFromHideout(){
        T a = hideout.get(0);
        hideout.remove(0);
        return a;
    }
    public boolean isInHideout(){
        return !hideout.isEmpty();
    }
}
