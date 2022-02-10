package com.demo.design.patterns.singleton;

public class Main {
    public static void main(String args[]) {

        Server instance1 = Server.getInstance();
        instance1.displayData();

        Server instance2 = Server.getInstance();
        instance2.addData("Hello");

        Server instance3 = Server.getInstance();
        instance3.displayData();

        instance1.deleteData();

        Server instance4 = Server.getInstance();
        instance4.deleteData();
        instance4.addData("Hello World!!");
        instance2.displayData();
        instance1.addData("Welcome to programming");
        instance3.displayData();

    }
}
