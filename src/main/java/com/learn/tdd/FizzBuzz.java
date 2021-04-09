package com.learn.tdd;

/**
 * @author 荀彧 2021/4/9
 */
public class FizzBuzz {
    private final int rawNumber;
    public FizzBuzz(int rawNumber) {
        this.rawNumber = rawNumber;
    }

    @Override
    public String toString() {
        if (rawNumber % 3 == 0 && rawNumber % 5 == 0) {
            return "fizzbuzz";
        }
        if(rawNumber % 3 == 0) {
            return "fizz";
        }

        if (rawNumber % 5 == 0) {
            return "buzz";
        }
        return String.valueOf(this.rawNumber);
    }
}

