import java.util.Arrays;

public class MagicSquareFactory {
    private int[][] square;
    public MagicSquare createMagicSquare(int size) {

        MagicSquare square = new MagicSquare(size);
        int n = size;
        int[][] magicSquare = new int[n][n];

        // Starting position
        int number = 1;
        int i = 0;
        int j = n / 2;
        while (number <= n * n) {
            magicSquare[i][j] = number;
            number++;

            int newI = (i - 1 + n) % n;
            int newJ = (j + 1) % n;

            if (magicSquare[newI][newJ] != 0) {
                newI = (i + 1) % n;
                newJ = j;
            }

            i = newI;
            j = newJ;
        }

        // Place the values into the MagicSquare object
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                square.placeValue(j, i, magicSquare[i][j]);
            }
        }

        return square;
    }


}
