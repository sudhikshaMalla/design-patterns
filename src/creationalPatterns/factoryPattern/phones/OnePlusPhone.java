package creationalPatterns.factoryPattern.phones;

public class OnePlusPhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from One Plus Phone..");
    }
}
