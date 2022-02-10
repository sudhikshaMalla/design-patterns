package com.demo.design.patterns.singleton;

public class Server {
    static Server serverInstance = null;
    String data = "";

    private Server() { }

    public static Server getInstance() {
        if(serverInstance == null) {
            serverInstance = new Server();
        }
        return serverInstance;
    }

    public void addData(String data) {
        this.data += data;
    }

    public void deleteData() {
        this.data = "";
    }

    public void displayData() {
        System.out.println(data);
    }
}
