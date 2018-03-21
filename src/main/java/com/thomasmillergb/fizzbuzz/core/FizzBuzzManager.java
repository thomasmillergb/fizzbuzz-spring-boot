package com.thomasmillergb.fizzbuzz.core;

//Not Required but since one method it is implicitly a functional interface
@FunctionalInterface
public interface FizzBuzzManager {

    /**
     *
     * @param input the input value
     * @return will return a string of Fizz, Buzz, FizzBuzz or the input
     */
    String printMessage(Integer input);
}
