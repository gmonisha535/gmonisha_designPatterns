package com.designpatterns.CommandPattern;

public class LightsonCmd implements Command{
	  Light light;
	  public LightsonCmd(Light light){
	    this.light = light;
	  }
	  public void execute(){
	    light.switchOn();
	    System.out.println("Light on");
	  }
}