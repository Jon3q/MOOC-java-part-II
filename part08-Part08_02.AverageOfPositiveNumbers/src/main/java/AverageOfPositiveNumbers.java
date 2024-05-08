
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, i = 0;
        double ave = 0;
        while (true){
            int a = scanner.nextInt();
            if (a == 0){
                break;
            }
            if (a > 0){
                sum += a;
                i++;
            }
        }
        if (sum > 0){
            ave = (double) sum/i;
            System.out.println(ave);
        } else {
            System.out.println("Cannot calculate the average");
        }



    }
}
