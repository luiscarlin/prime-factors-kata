package com.primefactors;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PrimeFactorsTest {

    PrimeFactors underTest;

    @Before
    public void setUp() throws Exception {
        underTest = new PrimeFactors();
    }

    @Test
    public void primeFactorOfOneIsEmpty() {
        assertThat(underTest.calculate(1), is(Arrays.asList()));
    }

    @Test
    public void primeFactorsOfTwoIsTwo() throws Exception {
        assertThat(underTest.calculate(2), is(Arrays.asList(2)));
    }
}
