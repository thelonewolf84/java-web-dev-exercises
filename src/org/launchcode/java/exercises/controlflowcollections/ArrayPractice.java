package org.launchcode.java.exercises.controlflowcollections;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] someOtherInts = {1, 1, 2, 3, 5, 8};

        String someString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        String[] splitSomeString = someString.split(" ");

        System.out.println(splitSomeString.toString());

        for (int i = 0; i < someOtherInts.length; i++) {
            if(!(someOtherInts[i] % 2 == 0)) {
                //System.out.print(someOtherInts[i]);
            }
        }
    }
}
