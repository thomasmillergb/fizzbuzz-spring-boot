package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
class FizzBuzzManagerImpl implements FizzBuzzManager {

    private FizzBuzzCommand fizzBuzzCommand_;
    private List<FizzBuzzCase> fizzBuzzCases_;

    @Autowired
    public void setFizzBuzzCommand(FizzBuzzCommand fizzBuzzCommand) {
        fizzBuzzCommand_ = fizzBuzzCommand;
    }

    public void setFizzBuzzCases(List<FizzBuzzCase> fizzBuzzCases) {
        fizzBuzzCases_ = fizzBuzzCases;
    }

    @Override
    public String printMessage(Integer input) {
        return fizzBuzzCommand_.execute(input, fizzBuzzCases_);
    }
}
