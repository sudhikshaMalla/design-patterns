package com.demo.design.patterns.factory;

public class PhoneFactory {

    public Phone getPhone(String phone_name) {
        if(phone_name.equals("Apple")) {
            return new IPhone();
        }
        else if(phone_name.equals("Asus")) {
            return new AsusPhone();
        }
        else {
            return new OnePlusPhone();
        }
    }

    public static Phone getPhoneInstance(String phone_name) {
        if(phone_name.equals("Apple")) {
            return new IPhone();
        }
        else if(phone_name.equals("Asus")) {
            return new AsusPhone();
        }
        else {
            return new OnePlusPhone();
        }
    }

}
