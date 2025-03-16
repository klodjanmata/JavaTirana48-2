package JavaAdvanced.Examples.AbstractClasses.Abstraction;

public class ApiClient implements HttpClient{

    @Override
    public void sendRequest(String url, String body) {
        System.out.println("Sending request via API Protocol!");
    }
}
