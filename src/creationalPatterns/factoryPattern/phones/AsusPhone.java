package creationalPatterns.factoryPattern.phones;

public class AsusPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from Asus Phone..");
    }
}
