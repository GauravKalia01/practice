package com.code_sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Stack;

public class practice_lists {

    public void listPrac() {

        //Jagdish tomorrow you need to add all the qa people of Clearstream name here in the list
        List testList = new ArrayList();
        testList.add("Jagdish");
        testList.add("Gaurav");
        testList.add("Jay");
        testList.add("Gaurav S");
        testList.add("Ronak");
        testList.add("Arpit");
        testList.add("Anand");
        testList.add("Nisha");
        testList.add("Supradip");
        testList.add("Pratik");


        System.out.println("Clearstream QA : "+ testList);
        System.out.println("-------------------------------");
//Added a StackList
        List StackList = new Stack();
        StackList.add("1");
        StackList.add("2");
        StackList.add("2");
        StackList.add("3");
        StackList.add("4");
        StackList.add("5");
        StackList.add("6");

        for(int i=0;i<StackList.size() ;i++) {
        System.out.println(StackList.get(i));
        }
        System.out.println("-------------------------------");
        //Adding all data of StackList to new list "copied list"
    List copiedList = new ArrayList();
        copiedList.addAll(StackList);
        System.out.print("Elements in copied list" + copiedList);

      System.out.print("testing for branch");
    }

}
