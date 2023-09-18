package com.example.tobyspring.learningtest.template;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;


public class CalcSumTest {
    /*@Test
    public void sumOfNumbers() throws IOException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calcSum(getClass().getResource("/txt/numbers.txt").getPath())).isEqualTo(10);
    }

    @Test
    public void multiplyOfNumbers() throws IOException {
        Calculator calculator = new Calculator();
        assertThat(calculator.calcMultiply(getClass().getResource("/txt/numbers.txt").getPath())).isEqualTo(24);
    }*/

    @Test
    public void concatenateStrings() throws IOException {
        Calculator calculator = new Calculator();
        assertThat(calculator.concatenate(getClass().getResource("/txt/numbers.txt").getPath())).isEqualTo("1234");
    }
}
