package org.launchcode.java.studiocountingcharacters;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CountingCharacters {


        public static void main(String[] args){
            String hiddenFigures = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
            Scanner input = new Scanner(System.in);

            String word;

            HashMap<Character, Integer> counts = new HashMap<>();



            do {
                System.out.println("Enter a word (or ENTER to finish):");

                word = input.nextLine().toLowerCase();

                if (!word.equals("")) {
                    for(int i =0; i < word.length(); i++) {

                        if(!counts.containsKey(word.charAt(i))){
                            counts.put(word.charAt(i), 1);
                        }else{
                            int newCount = counts.get(word.charAt(i)) + 1;
                            counts.replace(word.charAt(i), newCount);
                        }
                    }
                }
                System.out.println(counts);
            } while(!word.equals(""));

            /*
            for(int i =0; i < hiddenFigures.length(); i++) {

                if(!counts.containsKey(hiddenFigures.charAt(i))){
                    counts.put(hiddenFigures.charAt(i), 1);
                }else{
                    int newCount = counts.get(hiddenFigures.charAt(i)) + 1;
                    counts.replace(hiddenFigures.charAt(i), newCount);
                }


            }
            */
            System.out.println(counts);

        }
}

