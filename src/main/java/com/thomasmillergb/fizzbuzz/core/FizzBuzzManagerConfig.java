package com.thomasmillergb.fizzbuzz.core;

import com.thomasmillergb.fizzbuzz.common.FizzBuzzCase;
import com.thomasmillergb.fizzbuzz.core.FizzBuzzManager;
import com.thomasmillergb.fizzbuzz.core.FizzBuzzManagerImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;

/**
 * I have custom beans to allow for different input for example extra 10
 * Since this is all DI it has allowed it to be lossy coupled
 */
@Configuration
class FizzBuzzManagerConfig {

    /**
     *
     * @return standard fizzbuzz
     */
    @Bean
    public FizzBuzzManager standardFizzBuzz(){
        FizzBuzzManagerImpl fizzBuzzManager = new FizzBuzzManagerImpl();
        ArrayList<FizzBuzzCase> testCases = new ArrayList<>();
        testCases.add(new FizzBuzzCase(3, "Fizz"));
        testCases.add(new FizzBuzzCase(5, "Buzz"));
        fizzBuzzManager.setFizzBuzzCases(testCases);
        return fizzBuzzManager;
    }
    /**
     *
     * @return standard fizzbuzz
     */
    @Bean
    public FizzBuzzManager extraFizzBuzz(){
        FizzBuzzManagerImpl fizzBuzzManager = new FizzBuzzManagerImpl();
        ArrayList<FizzBuzzCase> testCases = new ArrayList<>();
        testCases.add(new FizzBuzzCase(3, "Fizz"));
        testCases.add(new FizzBuzzCase(5, "Buzz"));
        testCases.add(new FizzBuzzCase(10, "Extra"));
        fizzBuzzManager.setFizzBuzzCases(testCases);
        return fizzBuzzManager;
    }
}
