import java.util.HashMap;

public class Program {
    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("f.e", "for example");
        hashmap.put("etc.", "and so on");
        hashmap.put("i.e", "more precisely");

        printKeys(hashmap);
        System.out.println("---");
        printKeysWhere(hashmap, "i");
        System.out.println("---");
        printValuesOfKeysWhere(hashmap, ".e");
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        String[] keys = hashmap.keySet().toArray(new String[0]);
        for (int i = 0; i < hashmap.size(); i++) {
            System.out.println(keys[i]);
        }
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        String[] keys = hashmap.keySet().toArray(new String[0]);
        for (int i = 0; i < hashmap.size(); i++) {
            if (keys[i].contains(text)) {
                System.out.println(keys[i]);
            }
        }
    }
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text){
        String[] keys = hashmap.keySet().toArray(new String[0]);
        String[] values = hashmap.values().toArray(new String[0]);
        for (int i = 0; i < hashmap.size(); i++) {
            if (keys[i].contains(text)) {
                System.out.println(values[i]);
            }
        }
    }
}
