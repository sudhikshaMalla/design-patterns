package creationalPatterns.factoryPattern.phones;

public class IPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from IPhone..");
    }
}
