package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> calculate(int input) {
        List<Integer> primes = new ArrayList<>();

        for (int factor = 2; input > 1; factor++) {
            for (; input % factor == 0; input /= factor) {
                primes.add(factor);
            }
        }
        return primes;
    }
}
