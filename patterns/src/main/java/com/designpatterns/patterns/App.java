package com.designpatterns.patterns;

/**
 * Hello world!
 *
 */
import java.io.*;
import java.util.*;
import com.designpatterns.AdapterPattern.DriverAdapter;
import com.designpatterns.BridgePattern.DrawBridge;
import com.designpatterns.CommandPattern.DriverCommand;
import com.designpatterns.Prototype.DriverPrototype;
import com.designpatterns.SingletonPatterrn.DriverSingleton;
import com.designpatterns.TemplatePattern.DriverTemplate;
public class App 
{
    @SuppressWarnings("UnUsed")
	public static void main( String[] args )
    {
        DriverAdapter adapter_pattern = new DriverAdapter();
        DrawBridge bridge_pattern = new DrawBridge();
        DriverCommand command_pattern = new DriverCommand();
        DriverPrototype prototype_pattern = new DriverPrototype();
        DriverSingleton singleton_pattern = new DriverSingleton();
        DriverTemplate template_pattern = new DriverTemplate();
        
    }
}