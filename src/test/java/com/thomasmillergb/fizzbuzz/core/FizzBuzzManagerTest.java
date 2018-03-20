package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.AbstractFizzBuzzApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class FizzBuzzManagerTest extends AbstractFizzBuzzApplicationTests {

    @Autowired
    @Qualifier("standardFizzBuzz")
    private FizzBuzzManager fizzBuzzManager_;

    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String FIZZ_BUZZ = FIZZ + BUZZ;

    @Test
    public void notFizzBuzzReturnValueCase1() {
        Assert.assertEquals("-1", fizzBuzzManager_.printMessage(-1));
    }

    @Test
    public void notFizzBuzzReturnValueCase2() {
        Assert.assertEquals("1", fizzBuzzManager_.printMessage(1));
    }

    @Test
    public void notFizzBuzzReturnValueCase3() {
        Assert.assertEquals("2", fizzBuzzManager_.printMessage(2));
    }

    @Test
    public void notFizzBuzzReturnValueCase4() {
        Assert.assertEquals("4", fizzBuzzManager_.printMessage(4));
    }


    @Test
    public void fizzCase1() {
        Assert.assertEquals(FIZZ, fizzBuzzManager_.printMessage(3));
    }

    @Test
    public void fizzCase2() {
        Assert.assertEquals(FIZZ, fizzBuzzManager_.printMessage(6));
    }

    @Test
    public void fizzCase3() {
        Assert.assertEquals(FIZZ, fizzBuzzManager_.printMessage(9));
    }

    @Test
    public void fizzCase4() {
        Assert.assertEquals(FIZZ, fizzBuzzManager_.printMessage(12));
    }

    @Test
    public void buzzCase1() {
        Assert.assertEquals(BUZZ, fizzBuzzManager_.printMessage(5));
    }

    @Test
    public void buzzCase2() {
        Assert.assertEquals(BUZZ, fizzBuzzManager_.printMessage(10));
    }

    @Test
    public void buzzCase3() {
        Assert.assertEquals(BUZZ, fizzBuzzManager_.printMessage(20));
    }

    @Test
    public void fizzBuzzCase1() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzManager_.printMessage(0));
    }

    @Test
    public void fizzBuzzCase2() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzManager_.printMessage(15));
    }

    @Test
    public void fizzBuzzCase3() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzManager_.printMessage(30));
    }
}