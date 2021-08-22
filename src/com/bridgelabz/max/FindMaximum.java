package com.bridgelabz.max;

public class FindMaximum <T extends Comparable<T>> {
    T input1, input2, input3;

    public FindMaximum(T input1, T input2, T input3) {
        this.input1 = input1;
        this.input2 = input2;
        this.input3 = input3;
    }

    public T testMaximum() {
        return FindMaximum.getMax(input1,input2,input3);
    }

    public static <T extends Comparable<T>> T getMax(T input1, T input2, T input3){
        T max=input1;
        if(input2.compareTo(max)>0)
            max=input2;
        if(input3.compareTo(max)>0)
            max=input3;
        showMaxValue(input1, input2, input3, max);
        return max;
    }

    private static <T extends Comparable<T>> void showMaxValue(T input1, T input2, T input3, T max) {
        System.out.println("the input1 is "+input1+"\ninput2 is "+input2+"\ninput3 is "+input3);
        System.out.println("Maximum : " + max+"\n");
    }


    public static void main(String[] args) {
        Integer intValue1 = 300 , intValue2 = 900 , intValue3 = 60;
        Float floatValue1 = 9.3f , floatValue2 = 3.5f , floatValue3 = 8.7f;
        String stringValue1 = "Mango" , stringValue2 = "Orange" , stringValue3 = "PineApple";
        new FindMaximum<>(intValue1, intValue2, intValue3).testMaximum();
        new FindMaximum<>(floatValue1, floatValue2, floatValue3).testMaximum();
        new FindMaximum<>(stringValue1, stringValue2, stringValue3).testMaximum();

    }
}
