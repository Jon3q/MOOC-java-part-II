import java.util.Random;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Random ladyLuck = new Random(); // create Random object ladyLuck
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers should be printed?");
        int input = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < input; i++) {
            // Draw and print a random number
            int randomNumber = ladyLuck.nextInt(11);
            System.out.println(randomNumber);
        }
    }
}