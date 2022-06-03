package structuralPatterns.proxyPattern;

public class RemoteServer implements Server{

    StringBuffer data = new StringBuffer();

    @Override
    public void addData(String data) {
        this.data.append(data);
    }

    @Override
    public void removeData(int start, int end) {
        this.data.delete(start, end);
    }

    @Override
    public void printData() {
        System.out.println(data);
    }

    public StringBuffer getData() {
        return data;
    }
}