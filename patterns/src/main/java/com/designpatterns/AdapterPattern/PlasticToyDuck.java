package com.designpatterns.AdapterPattern;

class PlasticToyDuck implements ToyDuck 
{ 
    public void squeak(){ 
        System.out.println("Squeaking..."); 
    } 
} 