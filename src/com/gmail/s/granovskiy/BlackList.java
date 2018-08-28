package com.gmail.s.granovskiy;

import java.util.ArrayList;

public class BlackList {

	public static Object [] blackList = new Object[2];
		
	//  adding objects to the Black List
    public static void addObjectToBlackList (Object obj){
    	try {
    		for (int i = 0; i < blackList.length; i++) {
    			if(blackList[i] == null) {
    			    blackList[i] = obj;
    			    return;
    			} else if (blackList[i] != null && blackList[i+1] == null) {
    				blackList[i+1] = obj;
    				return;
    			}
			}

    	} catch(Exception e) {
    		e.printStackTrace();
    		System.out.println("Error!");
    	}
    }
    //  printing the Black List
	public static void printBlackList(){
		for(Object k:blackList){
		    System.out.println(k);
		}
	}
	
	static boolean check(Object obj) {
		if(obj.getClass() != hamster.getClass() && obj.getClass() != mouse.getClass()) {
			return true;
		}
		return false;
	}
	//  hamster.getClass() && obj.getClass() != mouse.getClass()
	//BlackList.addObjectToBlackList(mouse);
	

	/*
	 * 	        if (blackList[0]!=null){
		        for (int i = blackList.length-1; i > 0; i--){
		            blackList[i] = blackList[i-1];
		        }
	        }
	        blackList[0] = obj;
	        
	 * 
	 * 
	 * 
	public static String getClassNameFromScanner(){
		System.out.println("Would you like to enter another class to the Black List? Y/N");
	    Scanner sc = new Scanner(System.in);
	    String name = sc.nextLine();
		
	    String classNameFromScanner = null;
	    	    if(name.equals("Y")) {
	    	System.out.println("Please, enter the class that should be added to the Black List.(Mouse)");
	    	classNameFromScanner = sc.nextLine();
	    } else {
	    	System.out.println("Good-bye.");
	    }
	    sc.close();
		return classNameFromScanner;
	}
	*/
/*
	public static void addToBlackList(Class) {
		if (!checkBlackList(Cat)) {
			blackList.add(Cat);
		}
	}

	private static boolean checkBlackList(Class clas) {
		for (Class classOne : blackList) {
			if (classOne == clas) {
				return true;
			}
		}
		return false;
	}

	public boolean checkObject(Object obj) {
		if (obj == null) {
			return false;
		}
		Class clas = obj.getClass();
		System.out.println(clas);
		return checkBlackList(clas);
	}
	*/
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Object class1 : blackList) {
			sb.append(class1).append(System.lineSeparator());
		}
		return sb.toString();
	}

}
