package behaviouralPatterns.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        Request failed_request = new Request(true, false, false, false);
        RequestHandler requestHandler = new RequestHandler();
        System.out.println("Is request successful? " + requestHandler.isRequestComplete(failed_request));

        Request successful_request = new Request(true, true, true, true);
        RequestHandler requestHandler1 = new RequestHandler();
        System.out.println("Is request successful? " + requestHandler1.isRequestComplete(successful_request));
    }
}
