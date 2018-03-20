package com.thomasmillergb.fizzbuzz.services;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzTransfer;
import com.thomasmillergb.fizzbuzz.core.FizzBuzzManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
public class FizzBuzzController {


    private FizzBuzzManager fizzBuzzManager_;

    @Autowired
    @Qualifier("standardFizzBuzz")
    public void setFizzBuzzManager(FizzBuzzManager fizzBuzzManager) {
        fizzBuzzManager_ = fizzBuzzManager;
    }


    @RequestMapping("/standard/print/{input}")
    public FizzBuzzTransfer fizzBuzzPrint(@PathVariable Integer input) {
        return new FizzBuzzTransfer(fizzBuzzManager_.printMessage(input));
    }
}
