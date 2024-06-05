package dictionary;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import static java.awt.SystemColor.text;

public class SaveableDictionary{
    private HashMap<String, String> map;
    private String file;

    public SaveableDictionary() {
        this.map = new HashMap<>();
    }
    public SaveableDictionary(String file){
        this.map = new HashMap<>();
        this.file = file;
    }
    public boolean load(){
        try (Scanner scan = new Scanner(new File(this.file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                String[] parts = row.split(":");
                map.put(parts[0], parts[1]);
            }
            return true;
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return false;
    }

    public void add(String words, String translation) {
        if(!map.containsKey(words)) {
            map.put(words, translation);
        }
    }
    public String translate(String word) {
        if (map.containsKey(word)) {
            return map.get(word);
        }
        if(map.containsValue(word)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if (entry.getValue().equals(word)) {
                    return entry.getKey();
                }
            }
        }
            return null;
    }
    public boolean save() {
        try (PrintWriter writer = new PrintWriter(this.file)){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writer.println(entry.getKey() + ":" + entry.getValue());
            }
            return true;
        } catch (Exception e){
            System.out.println("aa");
            return false;
        }
    }
    public void delete(String word){
        if(map.containsKey(word)){
            map.remove(word);
        } else if (map.containsValue(word)){
            map.remove(translate(word));
        }
    }
}
