import java.util.ArrayList;
import java.util.Dictionary;
import java.util.HashMap;

public class DictionaryOfManyTranslations {
private HashMap<String, ArrayList<String>> map;

    public DictionaryOfManyTranslations(){
        this.map = new HashMap<>();
    }
    public void add(String word, String translation){
        this.map.putIfAbsent(word, new ArrayList<>());

        ArrayList<String> multiTranslation = this.map.get(word);
        multiTranslation.add(translation);
    }

    public ArrayList<String> translate(String word){
        ArrayList<String> allTranslations = this.map.get(word);
        if (allTranslations == null){
            return new ArrayList<>();
        }
        return allTranslations;
    }

    public void remove(String word){
        this.map.remove(word);
    }
}
