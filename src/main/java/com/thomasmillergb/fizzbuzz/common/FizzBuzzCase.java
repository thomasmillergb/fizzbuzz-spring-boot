package com.thomasmillergb.fizzbuzz.common;

import java.util.function.Predicate;

public final class FizzBuzzCase {
    private Predicate<Integer> predicate_;
    private String message_;

    /**
     * Defaults to the standard case of input % divisble by
     * @param divisibleBy what int should it be divisble by
     * @param message what is the message
     */
    public FizzBuzzCase(int divisibleBy, String message) {
        this(input -> (input % divisibleBy) == 0, message);
    }

    /**
     * Any predicate can be passed in which allows for future expandability
     * @param predicate a predicate
     * @param message what is the message
     */
    public FizzBuzzCase(Predicate<Integer> predicate, String message) {
        predicate_ = predicate;
        message_ = message;
    }


    public Predicate<Integer> getPredicate() {
        return predicate_;
    }

    public String getMessage() {
        return message_;
    }
}
