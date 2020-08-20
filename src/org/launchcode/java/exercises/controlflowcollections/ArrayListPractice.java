package org.launchcode.java.exercises.controlflowcollections;

import java.util.ArrayList;

public class ArrayListPractice {
    public static Integer getEvenNum(ArrayList<Integer> num) {
        int evenNumberSum = 0;
        for (int number : num){
            if(number % 2 == 0) {
                evenNumberSum += number;
            }
        }
        return evenNumberSum;
    }






    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(100);
        numbers.add(55);
        numbers.add(77);
        numbers.add(1000);
        numbers.add(1001);
        numbers.add(1002);
        numbers.add(1003);
        numbers.add(10007);

        System.out.print(getEvenNum(numbers));
    }

}
