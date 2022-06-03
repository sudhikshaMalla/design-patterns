package structuralPatterns.proxyPattern;

public class ProxyServer implements Server{

    RemoteServer remoteServer;

    StringBuffer cache;

    public ProxyServer(RemoteServer remoteServer) {
        this.remoteServer = remoteServer;
    }

    @Override
    public void addData(String data) {
        remoteServer.addData(data);
        cache = remoteServer.getData();
    }

    @Override
    public void removeData(int start, int end) {
        remoteServer.removeData(start, end);
        cache = remoteServer.getData();
    }

    @Override
    public void printData() {
        System.out.println(cache);
    }


}