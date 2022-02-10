package com.demo.design.patterns.factory;

public class AsusPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from Asus Phone..");
    }
}
