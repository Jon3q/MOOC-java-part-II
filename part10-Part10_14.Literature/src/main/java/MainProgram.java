import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        start();
    }
    public static void start(){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<Book>();
        while (true){
            System.out.println("Input the name of the book, empty stops: ");
            String name = scanner.nextLine();
            if (name.equals("")){
                break;
            }
            System.out.println("Input the age recommendation: ");
            int age = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, age);
            books.add(book);
        }
        Collections.sort(books);
        System.out.println(books.size() + " books in total.");
        System.out.println("Books:");
        for (Book book : books){
            System.out.println(book);
        }


    }
}