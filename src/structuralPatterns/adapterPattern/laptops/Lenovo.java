package structuralPatterns.adapterPattern.laptops;

public class Lenovo implements Laptop {

    String data = "";

    @Override
    public void writeData(String content) {
        data += content;
    }

    @Override
    public void readData() {
        System.out.println("Lenovo :: " + data);
    }

    @Override
    public void deleteData() {
        data = "";
    }
}