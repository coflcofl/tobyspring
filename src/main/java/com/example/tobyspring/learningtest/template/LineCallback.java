package com.example.tobyspring.learningtest.template;

public interface LineCallback<T> {
    //Integer doSomethingWithLine(String line, Integer value);
    T doSomethingWithLine(String line, T value);
}
