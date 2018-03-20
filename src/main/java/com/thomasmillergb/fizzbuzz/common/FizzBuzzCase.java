package com.thomasmillergb.fizzbuzz.common;

import java.util.function.Predicate;

public final class FizzBuzzCase {
    private Predicate<Integer> predicate_;
    private String message_;

    public FizzBuzzCase(int divisibleBy, String message) {
        this(input -> (input % divisibleBy) == 0, message);
    }

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
