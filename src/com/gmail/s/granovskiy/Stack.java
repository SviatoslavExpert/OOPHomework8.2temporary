package com.gmail.s.granovskiy;

import java.util.Arrays;

public class Stack {
	//  creating an array for objects
	public static Object [] list = new Object[3];
	
	//  adding objects to the list
    public static void addObject (Object obj){
    	try {
	        if (BlackList.check(obj)){
	               if (list[0]!=null){
		               for (int i = list.length-1; i > 0; i--){
		            	   list[i] = list[i-1];
		               }
	               }
	               list[0] = obj;
	        }
    	} catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Error!");
    	}
    }
    
	public static void printList(){
		for(Object k:list){
		    System.out.println(k);
		}
	}

	public static Object getObjectFromTopAndDelete (){
	    Object o = null;
	    if (list[0]!=null) {
	    	o = list[0];
	    	list[0]=null;
	    }
	    return o;
	}
	
	public static Object getObjectFromTop (){
		return list[0];
	}
	/*
	public static boolean check(Object obj) {
		if(obj.getClass() != hamster.getClass() && obj.getClass() != mouse.getClass()) {
			return true;
		}
		return false;
	}
	*/

    
	@Override
	public String toString() {
		return "List [list = " + Arrays.toString(list) + "]";
	}

}
