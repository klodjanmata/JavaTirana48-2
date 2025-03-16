package JavaAdvanced.Examples.AbstractClasses.Abstraction;

public class RestClient implements HttpClient{

    @Override
    public void sendRequest(String url, String body) {
        System.out.println("Sending Request via REST Protocol");
    }
}
