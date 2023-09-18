package com.example.tobyspring.learningtest.template;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Calculator {

    /*public Integer calcSum(String filepath) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            Integer sum = 0;
            String line = null;
            while ((line = br.readLine()) != null) {
                sum += Integer.valueOf(line);
            }
            return sum;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }finally {
            if(br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }*/

    public Integer fileReadTemplate(String filepath, BufferedReaderCallback callback) throws IOException {
        BufferedReader br = null;

        try {
            br = new BufferedReader(new FileReader(filepath));
            int ret = callback.doSomethingWithReader(br);
            return ret;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }finally {
            if(br != null) {
                try {
                    br.close();
                }catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    /*public Integer calcSum(String filepath) throws IOException {
        LineCallback sumCallback = new LineCallback() {
            @Override
            public Integer doSomethingWithLine(String line, Integer value) {
                return value + Integer.valueOf(line);
            }
        };

        return lineTemplate(filepath, sumCallback, 0);
    }*/

 /*   public Integer calcMultiply(String filepath) throws IOException {
        LineCallback multiplyCallback = new LineCallback() {
            @Override
            public Integer doSomethingWithLine(String line, Integer value) {
                return value * Integer.valueOf(line);
            }
        };

        return lineTemplate(filepath, multiplyCallback, 1);
    }*/

    public Integer lineTemplate(String filepath, LineCallback callback, int initVal) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            Integer res = initVal;
            String line = null;
            while((line = br.readLine()) != null) {
                res = null;//callback.doSomethingWithLine(line, res);
            }
            return res;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }finally {
            if(br != null) {
                try {
                    br.close();
                }catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public String concatenate(String filepath) throws IOException {
        LineCallback<String> concatenateCallback = new LineCallback<String>() {
            @Override
            public String doSomethingWithLine(String line, String value) {
                return value + line;
            }
        };

        return lineReadTemplate(filepath, concatenateCallback, "");
    }

    public String concatenateStrings(String filepath) throws IOException {
        LineCallback<String> concatenateCallback = new LineCallback<String>() {
            @Override
            public String doSomethingWithLine(String line, String value) {
                return value + line;
            }
        };

        return lineReadTemplate(filepath, concatenateCallback, "");
    }


    public <T> T lineReadTemplate(String filepath, LineCallback<T> callback, T initVal) throws IOException {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filepath));
            T res = initVal;
            String line = null;
            while((line = br.readLine()) != null) {
                res = callback.doSomethingWithLine(line, res);
            }
            return res;
        }catch (IOException e) {
            System.out.println(e.getMessage());
            throw e;
        }finally {
            if(br != null) {
                try {
                    br.close();
                }catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
