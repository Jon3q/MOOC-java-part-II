import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<String> everything = read("literacy.csv");
        List<Country> listOfCountries = new ArrayList<>();
        for (int i = 0;i<everything.size();i++){
            String a = everything.get(i);
            String[] pieces = a.split(",");
            Country country = new Country(pieces[0], pieces[1], pieces[2], pieces[3], pieces[4], Double.valueOf(pieces[5]));
            listOfCountries.add(country);
        }
        Collections.sort(listOfCountries);
        for (Country country : listOfCountries) {
            System.out.println(country);
        }
    }
    public static List<String> read(String file){
        List<String> list = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String row = scan.nextLine();
                list.add(row);
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

        return list;
    }

}
