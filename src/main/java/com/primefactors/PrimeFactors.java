package com.primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public List<Integer> calculate(int input) {
        List<Integer> primes = new ArrayList<>();

        while (input % 2 == 0) {
            primes.add(2);
            input /= 2;
        }

        if (input > 1) {
            primes.add(input);
        }

        return primes;
    }
}
