package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

//Remove Public as the bean should be injected with the interface type
//Prevents addtional objects being created outside of the package
//By abstracting the manager and the core logic this allow it to be more configurable and testable
@Component
class FizzBuzzManagerImpl implements FizzBuzzManager {

    private FizzBuzzCommand fizzBuzzCommand_;
    private List<FizzBuzzCase> fizzBuzzCases_;

    @Autowired
    public void setFizzBuzzCommand(FizzBuzzCommand fizzBuzzCommand) {
        fizzBuzzCommand_ = fizzBuzzCommand;
    }

    void setFizzBuzzCases(List<FizzBuzzCase> fizzBuzzCases) {
        fizzBuzzCases_ = fizzBuzzCases;
    }

    @Override
    public String printMessage(Integer input) {
        return fizzBuzzCommand_.execute(input, fizzBuzzCases_);
    }
}
