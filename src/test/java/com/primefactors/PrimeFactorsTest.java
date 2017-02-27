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
    public void primeFactorsOfTwoIsTwo() {
        assertThat(underTest.calculate(2), is(Arrays.asList(2)));
    }

    @Test
    public void primeFactorsOfThreeIsThree() {
        assertThat(underTest.calculate(3), is(Arrays.asList(3)));
    }

    @Test
    public void primeFactorsOfFourAreTwoTimesTwo() {
        assertThat(underTest.calculate(4), is(Arrays.asList(2, 2)));
    }

    @Test
    public void primeFactorsOfFiveIsFive() {
        assertThat(underTest.calculate(5), is(Arrays.asList(5)));
    }

    @Test
    public void primeFactorsOfSixAreThreeAndTwo() {
        assertThat(underTest.calculate(6), is(Arrays.asList(2, 3)));
    }

    @Test
    public void primeFactorsOfFourteenAreTwoAndSeven() {
        assertThat(underTest.calculate(14), is(Arrays.asList(2, 7)));
    }

    @Test
    public void primeFactorsOfEightHundredAndFortyAreThreeTimesTwoAndThreeAndFiveAndSeven() {
        assertThat(underTest.calculate(840), is(Arrays.asList(2, 2, 2, 3, 5, 7)));
    }
}
