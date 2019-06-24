package com.company;

import java.util.List;

import static com.company.Constants.NEWLINE;
import static com.company.Constants.SCAN;

public class Main {

    public static void main(String[] args) {
        System.out.print("Veuillez entrer un nombre entier : ");
        String input = SCAN.nextLine();
        Numbers number = new Numbers(input);
        System.out.println("La somme des n premier nombre est : " + number.sumOfNumber());
        System.out.println("Les nombres premiers suivants sont inférieurs à " + number + " : ");

        List<Integer> primeNumbers = number.getPrimeNumbers();
        for (int primeNumber : primeNumbers) {
            System.out.println("\t" + primeNumber);
        }

        List<Integer> testPrimeNumbers = number.testPrimeNumbers();
        if (testPrimeNumbers.size() != 0) {
            for (int falsePrimeNumber : testPrimeNumbers) {
                System.out.println(falsePrimeNumber);
            }
        } else {
            System.out.println("Tous ces nombres sont certifiés premiers");
        }
    }
}
