package com.patterns.behavioural.templateMethod;

public class TemplateMethodMain {

	public static void main(String[] args) {
		
		AbstractClass class1 = new BehaviourOne();
		AbstractClass class2 = new BehaviourTwo();
		
		System.out.println("------------------");
		
		class1.templateMethod();
		class2.templateMethod();
	}
}
