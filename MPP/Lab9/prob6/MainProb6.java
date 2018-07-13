package prob6;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainProb6 {

    public static void main(String[] args) {

        System.out.println(streamSection(nextStream(), 0, 3).collect(Collectors.joining(", ")));
        System.out.println(streamSection(nextStream(), 2, 5).collect(Collectors.joining(", ")));
        System.out.println(streamSection(nextStream(), 7, 8).collect(Collectors.joining(", ")));
    }

    public static Stream<String> streamSection(Stream<String> stream, long m, long n) {
        return stream.skip(m).limit((n + 1) - m);
    }

    //support method for the main method -- for testing
    private static Stream<String> nextStream() {
        return Arrays.asList("aaa", "bbb", "ccc", "ddd", "eee", "fff", "ggg", "hhh", "iii").stream();
    }
}
