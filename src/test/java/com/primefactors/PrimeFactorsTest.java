package com.primefactors;

import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {
    @Test
    public void primeFactorOfOneIsEmpty() {
        PrimeFactors primeFactor = new PrimeFactors();
        assertThat(primeFactor.calculate(1), is(Arrays.asList()));
    }
}
