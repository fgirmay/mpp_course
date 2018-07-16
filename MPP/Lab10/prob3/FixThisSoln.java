package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FixThisSoln {
    List<String> processList(List<String> list) {

        return list.stream()
                .map(this::doNothingIfShort)
                .collect(Collectors.toList());
    }

    String doNothingIfShort(String input) throws InputTooLongException {
        if (input.length() > 3) throw new InputTooLongException();
        else return input;
    }

    public static void main(String[] args) {
        FixThisSoln ft = new FixThisSoln();
        List<String> words1 = Arrays.asList("not", "too", "big", "yet");
        List<String> wordTwo = Arrays.asList("this", "is", "more", "than", "three", "word");
        System.out.println(ft.processList(words1));
        System.out.println(ft.processList(wordTwo));
    }

    class InputTooLongException extends RuntimeException {
        private static final long serialVersionUID = 1L;

        public InputTooLongException() {
            super("Must be length 3 or less");
        }

        public InputTooLongException(String s) {
            super(s);
        }
        public InputTooLongException(Throwable t) {
            super(t);
        }
    }
}
