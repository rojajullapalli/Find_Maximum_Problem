package com.bridgelabz.max;

import java.util.Scanner;

public class FindMaximum {

    public Integer maxNum(Integer input1, Integer input2, Integer input3){
        Integer max = input1;
        if(input2.compareTo(max) > 0)
            max = input2;
        if(input3.compareTo(max) > 0)
            max = input3;
        System.out.println("maximum of three integer is "+max);
        return max;
    }
    
    public Float maxNum(Float input1, Float input2, Float input3){
        Float max = input1;
        if(input2.compareTo(max) > 0)
            max = input2;
        if(input3.compareTo(max) > 0)
            max = input3;
        System.out.println("maximum of three float is "+max);
        return max;
    }

    public String maxNum(String input1, String input2, String input3){
        String max = input1;
        if(input2.compareTo(max) > 0)
            max = input2;
        if(input3.compareTo(max) > 0)
            max = input3;
        System.out.println("maximum of three float is "+max);
        return max;
    }

    public static void main(String[] args) {
        FindMaximum maximum=new FindMaximum();
        maximum.maxNum(2,4,6);
        maximum.maxNum(3.5f,8.2f,2.1f);
        maximum.maxNum("apple", "pineapple" ,"orange");
    }
}
