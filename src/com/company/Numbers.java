package com.company;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.ceil;

public class Numbers {

    @Override
    public String toString() {
        return "Numbers{" +
                "number=" + number +
                '}';
    }

    private Integer number;
    private List<Integer> numbers = new ArrayList<>();
    private List<Integer> primeNumbers = new ArrayList<>();
    private List<Integer> testPrimeNumbers = new ArrayList<>();

    public Numbers (String input) {
        number = Integer.parseInt(input);
        for (int i = 1; i <= number; i++) {
            numbers.add(i);
        }
    }

    public List<Integer> getPrimeNumbers() {
        return primeNumbers();
    }

    public int sumOfNumber() {
        return numbers.stream().mapToInt(Integer::intValue).sum();
    }

    public List primeNumbers () {
        for (int number : numbers) {
            boolean prime = true;
            for (int number2 = 2; number2 <= ceil(number / number2); number2++) {
                if (number % (number2) == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime == true) {
                primeNumbers.add(number);
            }
        }
        return primeNumbers;
    }

    public List testPrimeNumbers () {
        getPrimeNumbers();
        for (int primeNumber : primeNumbers) {
            for (int i = 2; i < primeNumber; i++) {
                if (primeNumber % i == 0) testPrimeNumbers.add(primeNumber);
            }
        }
        return testPrimeNumbers;
    }



    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
