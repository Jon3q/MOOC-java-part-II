
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input numbers, type end to stop");
        while (true){
            String num = scanner.nextLine();
            if (num.equals("end") ){
                break;
            }
            list.add(Integer.valueOf(num));
        }
        double ave = list.stream()
                .mapToInt(num -> Integer.valueOf(num))
                .average()
                .getAsDouble();
        System.out.println("average of the numbers: " + ave);
        // Write your program here

    }
}
