package prob10;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainProb10 {

    public static void main(String[] args) {
        // Solution for (a)
        IntStream ones = IntStream.range(1, 20).distinct();
        ones.forEach(System.out::print);

        // Solution for (b)
        Stream<String> stream = Stream.of("Bill", "Thomas", "Marry");
        System.out.println(stream.collect(Collectors.joining(", ")));

        // Solution for (c)
        Stream<Integer> myStream = Stream.of(4,7,9,2,12);
        IntSummaryStatistics summaryStatistics = myStream.collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println(summaryStatistics.getMax());
        System.out.println(summaryStatistics.getMin());

    }
}
