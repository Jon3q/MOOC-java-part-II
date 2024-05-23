import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadingFilesPerLine {
    public static void main(String[] args) {

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