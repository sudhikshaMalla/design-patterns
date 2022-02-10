package com.demo.design.patterns.factory;

public class IPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from IPhone..");
    }
}
