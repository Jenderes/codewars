package com.codewars;
import java.util.stream.IntStream;
public class PrimeStreaming {
    private static final int[] primes = new int[1_000_000 + 10];
    private static int last = 1;
    private static int i;
    static {
        primes[0] = 2;
        primes[1] = 3;
    }

    public static void main(String[] args) {
        System.out.println(stream());
    }
    public static IntStream stream() {
        i = 0;
        return IntStream.generate(() -> {
            if (i <= last) {
                return primes[i++];
            }
            int date;
            for (date = primes[i++ - 1] + 2; !prime(date); date += 2) ;
            return primes[++last] = date;
        });
    }
        public static boolean prime(final int n) {
            for (final int prime : primes) {
                if (prime * prime > n) {
                    return true;
                }
                if (n % prime == 0) {
                    return false;
                }
            }
            return true;
        }
    }
