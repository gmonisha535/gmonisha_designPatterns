package com.designpatterns.BridgePattern;

public class DrawBridge {
	public DrawBridge() {
		System.out.println();
		System.out.println("	BridgePattern	");
		Shape redCircle = new Circle(20,20, 5, new RedCircle());
        Shape blueCircle = new Circle(10,10, 5, new BlueCircle());

        redCircle.draw();
        blueCircle.draw();
	}
}