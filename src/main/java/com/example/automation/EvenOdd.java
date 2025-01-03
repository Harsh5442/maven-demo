package com.example.automation;


public class EvenOdd {
    // Method to check if a number is even or odd
    public String checkEvenOdd(int number) {
        if (number % 2 == 0) {
            return number + " is even.";
        } else {
            return number + " is odd.";
        }
    }

    // Method to find even numbers in a range
    public String findEvenNumbersInRange(int start, int end) {
        StringBuilder result = new StringBuilder("Even numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    // Method to find odd numbers in a range
    public String findOddNumbersInRange(int start, int end) {
        StringBuilder result = new StringBuilder("Odd numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                result.append(i).append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        EvenOdd eo = new EvenOdd();

        // Checking a single number
        System.out.println(eo.checkEvenOdd(4));
        System.out.println(eo.checkEvenOdd(7));

        // Finding even and odd numbers in a range
        System.out.println(eo.findEvenNumbersInRange(1, 10));
        System.out.println(eo.findOddNumbersInRange(1, 10));
    }
}

