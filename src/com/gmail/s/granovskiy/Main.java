package com.gmail.s.granovskiy;

public class Main {

	public static void main(String[] args) {
		//creating stack object
		//Stack stack = new Stack();
		
		//  creating some objects 
		Cat cat = new Cat("Tom", 5, true);
		Dog dog = new Dog("Boy", 7, true);
		Fish fish = new Fish("Linda", 1, false);
		Bird bird = new Bird("Sonia", 2, false);
		
		//  adding objects to the Stack
		Stack.addObject(cat);
		Stack.addObject(dog);
		Stack.addObject(fish);
		
		//  printing the properties of the object catOne to the console
		System.out.println("1. This is the original stack:");
		Stack.printList();
		
		//  getting the object from the top, deleting it and printing it
		System.out.println();
		System.out.println("This is the object from the top of the stack:");
		System.out.println((Stack.getObjectFromTopAndDelete()).toString());
		
		//  printing the list
		System.out.println();
		System.out.println("2. This is the stack after getting the object from top and deleting it:");
		Stack.printList();
		
		//  adding bird object to the top of the stack
		Stack.addObject(bird);
		
		//  printing the list
		System.out.println();
		System.out.println("3. This is the stack after adding another object to the top of the stack:");
		Stack.printList();
		
		//  getting object from the top of the stack
		System.out.println();
		System.out.println("This is the object from the top of the stack:");
		System.out.println((Stack.getObjectFromTop()).toString());	
		
		//  adding objects to Black List
		BlackList.addObjectToBlackList(mouse);
		BlackList.addObjectToBlackList(hamster);
		
		//  printing the Black List
		System.out.println();
		System.out.println("This is the Black List:");
		BlackList.printBlackList();
		
		Stack.addObject(mouse);

	}
	public static Mouse mouse = new Mouse("Tina", 1, false);
	public static Hamster hamster = new Hamster("Bob", 2, true);

}
