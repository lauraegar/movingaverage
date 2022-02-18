package org.lauraegar;




public class App  {

    public static void averageIt(Integer [] example, Integer N ) {
        MovingAverage movingAverage = new MovingAverage(N);
        for (Integer x : example) {
            movingAverage.add(x);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("Moving Average");

        //MovingAverage movingAverage = new MovingAverage(3);
        Integer[] example = {3, 4, 5, 4};
        averageIt(example, 3);

        Integer[] example2 = {3,4,5,6};
        averageIt(example2, 2);

        Integer[] example3 = {3,4,5,6};
        averageIt(example3,1);
    }
}

