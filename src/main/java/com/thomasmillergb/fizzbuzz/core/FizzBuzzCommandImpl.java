package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
class FizzBuzzCommandImpl implements FizzBuzzCommand {
    @Override
    public String execute(final int input, List<FizzBuzzCase> fizzBuzzCases) {
        String output = fizzBuzzCases.stream()
                //Find all cases which apply
                .filter(fizzBuzzCase -> fizzBuzzCase.getPredicate().test(input))
                //Get all the Messages
                .map(FizzBuzzCase::getMessage)
                //Join all the messages
                .collect(Collectors.joining());
        return output.isEmpty() ? String.valueOf(input) : output;
    }
}
