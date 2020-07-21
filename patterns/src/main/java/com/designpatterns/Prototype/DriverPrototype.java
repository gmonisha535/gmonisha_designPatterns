package com.designpatterns.Prototype;

public class DriverPrototype {
	public DriverPrototype() {
		System.out.println();
		System.out.println("	Prototype_Pattern	 ");
		ColourStore.getColour("Grey").addColour(); 
	    ColourStore.getColour("Black").addColour(); 
	    ColourStore.getColour("Black").addColour(); 
	    ColourStore.getColour("Grey").addColour(); 
	}
}
