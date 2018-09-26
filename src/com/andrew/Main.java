package com.andrew;

public class Main {

//    ## Code Challenge - Fizzbuzz
//    Write a program that prints the numbers from 1 to 100. But for multiples of
//  three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
//    For numbers which are multiples of both three and five print “FizzBuzz”
    public static void main(String[] args) {
	    minmax();
    }

    public static void fizzbuzz() {
        for (int val = 1; val <= 100; val = val + 1) {
            String output = "";
            if (val % 3 == 0) {
                output = output.concat("Fizz");
            }

            if (val % 5 == 0) {
                output = output.concat("Buzz");
            }

            if (output.length() == 0) {
                output = output.concat(Integer.toString(val));
            }
            System.out.println(output);
        }
    }
    //## Code Challenge - Min and Max
    //Given an array of integers such that the elements are sorted in
    // increasing then decreasing order, WITHOUT SORTING find the smallest
    // integer in the array.   Find the largest.
    // [1,4,6,9,3,0, -3, -12, - 60]
    //
    //[0,1,2,3,4,2,1]
    //from Joshua Sartwell (Ford) to Everyone:
    //[1,2,3,4]
    //from Joshua Sartwell (Ford) to Everyone:
    //[100,50,25,1]
    //from Joshua Sartwell (Ford) to Everyone:
    //[1]
    public static void minmax() {
        int[] numbers = {0,1,2,3,4,2,1};

        Integer min = null;
        Integer max = null;
        for (int pos = 0; pos < numbers.length; pos = pos + 1) {
            Integer current = numbers[pos];

            if (min == null) {
                min = numbers[pos];
            } else {
                if (min > current) {
                    min = current;
                }
            }

            if (max == null) {
                max = numbers[pos];
            } else {
                if (max < current) {
                    max = current;
                }
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
