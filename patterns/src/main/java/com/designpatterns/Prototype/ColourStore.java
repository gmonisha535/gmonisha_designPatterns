package com.designpatterns.Prototype;

import java.util.*;

public class ColourStore {
	private static Map<String, Colour> colourMap = new HashMap<String, Colour>();  
    
    static 
    { 
        colourMap.put("Grey", new GreyColour()); 
        colourMap.put("Black", new BlackColour()); 
    } 
       
    public static Colour getColour(String colourName) 
    { 
        return (Colour) colourMap.get(colourName).clone(); 
    } 
}
