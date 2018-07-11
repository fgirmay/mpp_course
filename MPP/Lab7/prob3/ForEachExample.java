package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;
import java.util.function.Consumer;


public class ForEachExample implements Consumer<String> {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        Consumer fee = new ForEachExample();

        //print each element of the list in upper case format
        list.forEach(fee);
    }

    @Override
    public void accept(String s) {
        System.out.println(s.toUpperCase());
    }


}