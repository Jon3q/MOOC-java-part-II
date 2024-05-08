
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String a = scanner.nextLine();

            if (a.equals("end")){
                break;
            }
            int num = Integer.valueOf(a);
            System.out.println(num * num * num);
        }
    }
}
