import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.println("Input numbers, type \"end\" to stop.");
        while (true){
            String add = scanner.nextLine();
            if (add.equals("end")){
                break;
            }
            list.add(Integer.valueOf(add));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String want = scanner.nextLine();
        if (want.equals("n")){
            double aveOfN = list.stream()
                    .mapToInt(add -> Integer.valueOf(add))
                    .filter(a -> a < 0 )
                    .average()
                    .getAsDouble();
            System.out.println(aveOfN);
        }

        if (want.equals("p")){
            double aveOfP = list.stream()
                    .mapToInt(add -> Integer.valueOf(add))
                    .filter(a -> a >= 0 )
                    .average()
                    .getAsDouble();
            System.out.println(aveOfP);
        }
    }
}