package com.thomasmillergb.fizzbuzz.services;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzTransfer;
import com.thomasmillergb.fizzbuzz.core.FizzBuzzManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fizzbuzz")
//Not a normal issue but due to running locally this is the most simple solution for the task.
//Could be resolved by hosting frontend on a http sever or setting up a proxy
@CrossOrigin(origins = "http://localhost:3000")
public class FizzBuzzController {


    private FizzBuzzManager fizzBuzzManager_;

    //Use Setter DI over field injection.
    @Autowired
    @Qualifier("standardFizzBuzz")
    public void setFizzBuzzManager(FizzBuzzManager fizzBuzzManager) {
        fizzBuzzManager_ = fizzBuzzManager;
    }

    //At this point normally i would normally create an endpoint test with mocha, however did not want to over complicate the assignment
    @RequestMapping("/standard/print/{input}")
    public FizzBuzzTransfer fizzBuzzPrint(@PathVariable Integer input) {
        return new FizzBuzzTransfer(fizzBuzzManager_.printMessage(input));
    }
}
