
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int first = 0;
        int second = 0;

        while (true) {
            System.out.println("First: " + first + "/100");
            System.out.println("Second: " + second + "/100");

            String input = scan.nextLine();
            String[] parts = input.split(" ");

            String command = parts[0];
            if (command.equals("quit")) {
                break;
            }
            int amount = Integer.valueOf(parts[1]);
            if (command.equals("add")) {
                if (amount >= 0) {
                    if (first + amount < 100) {
                        first += amount;
                    } else {
                        first = 100;
                    }
                }
            } else if (command.equals("move")){
                if (first > 0){
                    if (first >= amount){
                        if (second + amount <= 100) {
                            first -= amount;
                            second += amount;
                        } else if (second + amount >= 100) {
                            first -= amount;
                            second = 100;
                        }
                    } else if (first < amount) {
                        if (second + amount <= 100) {
                            second += first;
                        } else {
                            second = 100;
                        }
                        first = 0;
                    }
                }
            } else if (command.equals("remove")) {
                if (amount >= 0)
                    if (second > 0) {
                        if (second < amount) {
                            second = 0;
                        } else {
                            second -= amount;
                        }
                    }
            }
        }
    }

}
