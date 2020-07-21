package com.designpatterns.AdapterPattern;

public class DriverAdapter {
	
	public DriverAdapter() {
		System.out.println("	Adapter_Pattern		");
		Parrot sparrow = new Parrot(); 
	    ToyDuck toyDuck = new PlasticToyDuck(); 
	    ToyDuck birdAdapter = new BirdAdapter(sparrow); 
	    System.out.println("ToyDuck"); 
	    toyDuck.squeak(); 
	    System.out.println("BirdAdapter"); 
	    birdAdapter.squeak(); 
	    System.out.println("Sparrow"); 
	    sparrow.fly(); 
	    sparrow.makeSound(); 
	}
}