package org.example;

import java.util.ArrayList;
import java.util.List;

public class ThreadExampleMain {

    public static void main(String[] args) {

        List<ThreadExample> threadExampleList = new ArrayList<>();
        for(int i=0;i<3;i++)
            threadExampleList.add(new ThreadExample());

        for(ThreadExample threadExample:threadExampleList){
            threadExample.start();
        }


    }

}
