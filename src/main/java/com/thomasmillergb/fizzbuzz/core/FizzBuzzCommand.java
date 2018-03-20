package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;

import java.util.List;

@FunctionalInterface
public interface FizzBuzzCommand {
    /**
     *
     * @param input the input value
     * @param fizzBuzzCases the test cases
     * @return if no test cases pass will return input else will return a combined message of the test cases
     */
    String execute(int input, List<FizzBuzzCase> fizzBuzzCases);
}
