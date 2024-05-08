import java.util.HashMap;

public class Nicknames {

    public static void main(String[] args) {
        HashMap<String, String> hashmap = new HashMap<>();
        hashmap.put("matt", "matthew");
        hashmap.put("mix", "michael");
        hashmap.put("artie", "arthur");

        System.out.println(hashmap.get("matt"));
    }

}