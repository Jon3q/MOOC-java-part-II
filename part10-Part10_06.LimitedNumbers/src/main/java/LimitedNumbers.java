import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        while (true){
            int a = Integer.valueOf(scanner.nextLine());
            if (a == -1){
                break;
            }
            list.add(a);
        }
        list.stream()
                .filter(value -> value >= 1 && value <= 5)
                .collect(Collectors.toCollection(ArrayList::new))
                .forEach(value -> System.out.println(value));
    }
}