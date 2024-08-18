package org.example;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    

    public static <T> List<T> arrayToListx(T[] array){
        List<T> arrList = new ArrayList<>();
        for(T t: array){
            arrList.add(t);
        }
        return arrList;
        // return null;
    }

    public static <T> List<T> arrayToList(T... array){
        List<T> arrList = new ArrayList<>();
        for(T t: array){
            arrList.add(t);
        }
        return arrList;
        // return null;
    }
    
    public static void main(String[] args) {
    
    String[] array = {"hi", "hello"};
    arrayToList(array);
    arrayToList("hello");
    System.out.println(arrayToList(array).toString());
    }
    
}
