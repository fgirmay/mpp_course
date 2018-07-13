package prob4;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MainProb4 {

    private final Stream<BigInteger> primes = Stream.iterate(new BigInteger("2"), BigInteger::nextProbablePrime);

    public static void main(String[] args) {

        System.out.println(Arrays.toString(new MainProb4().printFirstNPrimes(10).toArray()));
        System.out.println(Arrays.toString(new MainProb4().printFirstNPrimes(5).toArray()));
        System.out.println(Arrays.toString(new MainProb4().printFirstNPrimes(2).toArray()));

    }
    private Stream<BigInteger> printFirstNPrimes(long n){
        Supplier<Stream<BigInteger>> streamSupplier = () -> primes;
        return streamSupplier.get().limit(n);

    }
}
