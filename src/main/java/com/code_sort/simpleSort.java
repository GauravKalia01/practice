package com.code_sort;

import java.util.ArrayList;
import java.util.List;

public class simpleSort {

	public String Sample() {
		return "sample";
	}
	public static void main( String[] args ) {
		System.out.println("test maven !");
		System.out.println("Gaurav and Jagdish repository");

		System.out.println("-- This is our Practice for march");
//added a list
		List mylist = new ArrayList();

		mylist.add("gaurav");
		mylist.add("jagdish");
		System.out.println("who all are currently working on this repo :" + mylist);

//Creating an object for practice_class
		practice_lists obj = new practice_lists();

//calling function
		obj.listPrac();
	}}
