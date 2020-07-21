package com.designpatterns.CommandPattern;

public class LightsoffCmd implements Command{
	  //reference to the light
	  Light light;
	  public LightsoffCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOff();
	    System.out.println("Light off");
	  }
}

