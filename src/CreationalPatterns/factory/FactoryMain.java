package com.demo.design.patterns.factory;

public class FactoryMain {
    public static void main(String[] args) {
        PhoneFactory phoneFactory = new PhoneFactory();

        Phone iphone1 = phoneFactory.getPhone("Apple");
        iphone1.call();

        Phone asus1 = phoneFactory.getPhone("Asus");
        asus1.call();

        Phone oneplus1 = phoneFactory.getPhone("OnePlus");
        oneplus1.call();

        Phone iphone2 = PhoneFactory.getPhoneInstance("Apple");
        iphone2.call();
    }
}
