package org.lauraegar;

import java.util.*;
import java.util.Deque;

public class MovingAverage {

        Integer N;
        Integer movTotal = 0;
        int counter = 0;
        Deque listOfNumbers = new ArrayDeque<Integer>();

        public MovingAverage(Integer N) {
            this.N = N;
        }
        public Double add(Integer X) {
            ++counter;
            // calculate the new sum by shifting the window
            listOfNumbers.add(X);
            Integer front;   //make a variable for the front of the sliding window
            if (counter > N)
                front = (Integer)
                        listOfNumbers.poll();
            else front = 0;


            movTotal= movTotal - front + X;
            Double movAverage = movTotal * 1.0 / Math.min(N, counter);
            System.out.println(movAverage);
            return movAverage;
        }
}

