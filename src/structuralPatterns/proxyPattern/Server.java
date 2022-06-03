package structuralPatterns.proxyPattern;

public interface Server {

    void addData(String data);
    void removeData(int start, int end);

    void printData();

}
