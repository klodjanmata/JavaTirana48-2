package JavaAdvanced.Examples.AbstractClasses.Abstraction;

public class SoapClient implements HttpClient{
    @Override
    public void sendRequest(String url, String body) {
        System.out.println("Sending HTTP request with SOAP Protocol");
    }
}
