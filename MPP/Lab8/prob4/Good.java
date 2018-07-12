package prob4;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Good {

    public static void main(final String[] args) {

       Good good = new Good();

        List<String> list = new ArrayList<>();

        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesdasy");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        int result = good.countWords(list, 'y', 'n', 6);
        System.out.println(result);


    }

    public int countWords(List<String> words, char c, char d, int len){

        return words.stream()
                .filter(word -> word.length() == len)
                .filter(word -> word.contains(String.valueOf(c)))
                .filter(word -> !word.contains(String.valueOf(d)))
                .collect(Collectors.toList())
                .size();
    }
}
