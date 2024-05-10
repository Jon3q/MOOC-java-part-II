import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;


public class StorageFacility {
private HashMap<String, ArrayList<String>> map;

    public StorageFacility(){
        this.map = new HashMap<>();
    }
    public void add(String unit, String item){
        this.map.putIfAbsent(unit, new ArrayList<>());
        ArrayList<String> currentObj = map.get(unit);
        currentObj.add(item);
    }
    public ArrayList<String> contents(String storageUnit){
        ArrayList<String> clone = this.map.get(storageUnit);
        if ( clone == null){
            return new ArrayList<>();
        }
        return clone;
    }

    public void remove(String storageUnit, String item){
        ArrayList<String> toRemove = this.map.get(storageUnit);
        toRemove.remove(item);

    }
    public ArrayList<String> storageUnits(){
        Set<String> keys = map.keySet();
        String[] keysArray = new String[keys.size()];
        keysArray = keys.toArray(keysArray);
        ArrayList<String> output = new ArrayList<>();

        for (String key : keysArray){
            if (!this.map.get(key).isEmpty()){
                output.add(key);
            }
        }

        return output;
    }
}
