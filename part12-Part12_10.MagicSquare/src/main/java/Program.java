
public class Program {

    public static void main(String[] args) {
        // Test the MagicSquare class here
        MagicSquare square = new MagicSquare(3);
        square.placeValue(1,1,5);
        System.out.println(square.giveAllNumbers());

        MagicSquareFactory msFactory = new MagicSquareFactory();
        System.out.println(msFactory.createMagicSquare(3));
    }
}
