package com.bridgelabz.max;

import java.util.ArrayList;
import java.util.Collections;

public class FindMaximum<T extends Comparable<T>>{
        ArrayList<T> list = new ArrayList<T>();


        //contructor accept multiple arguments
        FindMaximum(T... inputs){
            for (T value : inputs){
                this.list.add(value);
            }
        }

        public T testMaximum() {
            return FindMaximum.testMaximum(list);
        }

        public static <T extends Comparable<T>> T testMaximum(ArrayList<T> list) {
            // Sort the list in ascending order
            Collections.sort(list);
            // last position holds the max value
            T maxValue = list.get(list.size() - 1);
            System.out.println("Maximum : " + maxValue);
            return maxValue;
        }


        public static void main(String[] args) {
            Integer intValue1 = 300 , intValue2 = 900 , intValue3 = 60,intValue4=120;
            Float floatValue1 = 9.3f , floatValue2 = 3.5f , floatValue3 = 8.7f, floatValue4=17.2f;
            String stringValue1 = "Mango" , stringValue2 = "Orange" , stringValue3 = "PineApple", stringvalue4 = "Papaya";
            new FindMaximum<>(intValue1, intValue2, intValue3, intValue4).testMaximum();
            new FindMaximum<>(floatValue1, floatValue2, floatValue3, floatValue4).testMaximum();
            new FindMaximum<>(stringValue1, stringValue2, stringValue3, stringvalue4).testMaximum();
        }
}
