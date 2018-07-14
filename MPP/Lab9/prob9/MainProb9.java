package prob9;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MainProb9 {

    public static void main(String[] args) {
        printSquares(4);
    }

    private static void printSquares(long num) {

        IntStream stream = IntStream.iterate(1, s -> {
            s = (int) Math.sqrt(s);
            return ++s * s;
        }).limit(num);
        System.out.println(Arrays.toString(stream.toArray()));

    }
}
