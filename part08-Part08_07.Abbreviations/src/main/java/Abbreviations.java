import java.util.HashMap;

public class Abbreviations {
    private String abbreviation;
    private String explanation;
    private HashMap<String, String> hashMap;

    public Abbreviations(){
        this.hashMap = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation){
        hashMap.put(abbreviation, explanation);
    }

    public boolean hasAbbreviation(String abbreviation){
        if(hashMap.containsKey(abbreviation)){
            return true;
        }
        return false;
    }

    public String findExplanationFor(String abbreviation){
        return hashMap.get(abbreviation);
    }
}
