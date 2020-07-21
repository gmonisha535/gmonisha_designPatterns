package com.designpatterns.CommandPattern;

public class DriverCommand {
	public DriverCommand() {
		System.out.println();
		System.out.println("	Command_Pattern		");
		RemoteControl control = new RemoteControl();
	    Light light = new Light();
	    Command lightsOn = new LightsonCmd(light);
	    Command lightsOff = new LightsoffCmd(light);
	    control.setCommand(lightsOn);
	    control.pressButton();
	    control.setCommand(lightsOff);
	    control.pressButton();
	}
}