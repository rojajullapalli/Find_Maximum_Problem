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

    public static void main(String[] args) {
        FindMaximum maximum=new FindMaximum();
        maximum.maxNum(2,4,6);
    }
}
