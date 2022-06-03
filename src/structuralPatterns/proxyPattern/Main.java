package structuralPatterns.proxyPattern;

public class Main {
    public static void main(String[] args) {

        RemoteServer remote = new RemoteServer();

        Server local = new ProxyServer(remote);

        local.printData();
        local.addData("Hi");
        local.printData();
        local.removeData(1, 2);
        local.printData();
        local.addData("ello ");
        local.printData();
        local.addData("World!!");
        local.printData();

    }
}