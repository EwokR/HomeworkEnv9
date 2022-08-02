package com.example.homeworkenv9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IntegerList integerList = new IntegerListImpl();
        integerList.add(0); //0
        integerList.add(1);//1
        integerList.add(2);//2
        integerList.add(3);//3

        integerList.add(3,6);

        integerList.remove(1);

        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.clear();
        System.out.println(integerList.size());
    }
}