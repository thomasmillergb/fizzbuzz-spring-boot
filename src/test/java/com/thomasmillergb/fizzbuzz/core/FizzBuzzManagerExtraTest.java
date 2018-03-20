package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.AbstractFizzBuzzApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FizzBuzzManagerExtraTest extends AbstractFizzBuzzApplicationTests {

    @Autowired
    @Qualifier("extraFizzBuzz")
    private FizzBuzzManager fizzBuzzManager_;

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String EXTRA = "Extra";


    @Test
    public void buzzExtraCase1() {
        Assert.assertEquals(BUZZ + EXTRA, fizzBuzzManager_.printMessage(10));
    }

    @Test
    public void buzzExtraCase2() {
        Assert.assertEquals(BUZZ + EXTRA, fizzBuzzManager_.printMessage(10));
    }

    @Test
    public void buzzExtraCase3() {
        Assert.assertEquals(FIZZ + BUZZ + EXTRA, fizzBuzzManager_.printMessage(30));
    }

}