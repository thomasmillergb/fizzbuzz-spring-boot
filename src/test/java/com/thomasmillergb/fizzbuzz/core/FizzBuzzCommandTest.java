package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.AbstractFizzBuzzApplicationTests;
import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzzCommandTest extends AbstractFizzBuzzApplicationTests {

    @Autowired
    private FizzBuzzCommand fizzBuzzCommand_;

    private List<FizzBuzzCase> defaultCases_;
    private final String FIZZ = "Fizz";
    private final String BUZZ = "Buzz";
    private final String FIZZ_BUZZ = FIZZ + BUZZ;

    @Before
    public void setUp() {
        defaultCases_ = new ArrayList<>();
        defaultCases_.add(new FizzBuzzCase(3, FIZZ));
        defaultCases_.add(new FizzBuzzCase(5, BUZZ));
    }

    @Test
    public void notFizzBuzzReturnValueCase1() {
        Assert.assertEquals("-1", fizzBuzzCommand_.execute(-1, defaultCases_));
    }

    @Test
    public void notFizzBuzzReturnValueCase2() {
        Assert.assertEquals("1", fizzBuzzCommand_.execute(1, defaultCases_));
    }

    @Test
    public void notFizzBuzzReturnValueCase3() {
        Assert.assertEquals("2", fizzBuzzCommand_.execute(2, defaultCases_));
    }

    @Test
    public void notFizzBuzzReturnValueCase4() {
        Assert.assertEquals("4", fizzBuzzCommand_.execute(4, defaultCases_));
    }


    @Test
    public void fizzCase1() {
        Assert.assertEquals(FIZZ, fizzBuzzCommand_.execute(3, defaultCases_));
    }

    @Test
    public void fizzCase2() {
        Assert.assertEquals(FIZZ, fizzBuzzCommand_.execute(6, defaultCases_));
    }

    @Test
    public void fizzCase3() {
        Assert.assertEquals(FIZZ, fizzBuzzCommand_.execute(9, defaultCases_));
    }

    @Test
    public void fizzCase4() {
        Assert.assertEquals(FIZZ, fizzBuzzCommand_.execute(12, defaultCases_));
    }

    @Test
    public void buzzCase1() {
        Assert.assertEquals(BUZZ, fizzBuzzCommand_.execute(5, defaultCases_));
    }

    @Test
    public void buzzCase2() {
        Assert.assertEquals(BUZZ, fizzBuzzCommand_.execute(10, defaultCases_));
    }

    @Test
    public void buzzCase3() {
        Assert.assertEquals(BUZZ, fizzBuzzCommand_.execute(20, defaultCases_));
    }

    @Test
    public void fizzBuzzCase1() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzCommand_.execute(0, defaultCases_));
    }

    @Test
    public void fizzBuzzCase2() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzCommand_.execute(15, defaultCases_));
    }

    @Test
    public void fizzBuzzCase3() {
        Assert.assertEquals(FIZZ_BUZZ, fizzBuzzCommand_.execute(30, defaultCases_));
    }

}