package com.lab.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListImpl {

	public static void main(String[] args) {
		ArrayList<String> list= new ArrayList<>();
		list.add("Siddhesh");
		list.add("Aditya");
		list.add("Vedant");
		list.add("Sarang");
		list.add("Harshad");
		list.add("Rushi");
		ArrayList<String> list2= new ArrayList<>();
		list.add("More");
		list.add("Mashere");
		list.add("Takalkar");
		list.add("Kadam");
		list.add("Karale");
		list.add("Magadum");
		list.addAll(list2);
		
		Iterator<String>itr = list.iterator() ; 
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
		

	}

}
