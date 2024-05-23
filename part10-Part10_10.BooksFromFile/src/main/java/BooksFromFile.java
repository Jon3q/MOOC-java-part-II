import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BooksFromFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
    }
    public static List<Book> readBooks(String file){
        List<Book> list = new ArrayList<>();
        try (Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String[] row = scan.nextLine().split(",");
                Book newBook = new Book(row[0], Integer.valueOf(row[1]), Integer.valueOf(row[2]), row[3]);
                list.add(newBook);
            }
        } catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        return list;
    }
}
