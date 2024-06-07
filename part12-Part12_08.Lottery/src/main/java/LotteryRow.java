import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryRow() {
        this.random = new Random();
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }

    public void randomizeNumbers() {
        // initialize the list for numbers
        this.numbers = new ArrayList<>();
        while (numbers.size() < 7) {  // Use < instead of <= to add exactly 7 numbers
            int a = random.nextInt(40) + 1;
            if (containsNumber(a)) {
                continue;
            } else {
                numbers.add(a);
            }
            // Implement the randomization of the numbers by using the method containsNumber() here
        }
    }

        public boolean equals (Object other){
            return false;
        }

}