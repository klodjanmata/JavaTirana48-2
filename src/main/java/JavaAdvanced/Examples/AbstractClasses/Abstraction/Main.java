package JavaAdvanced.Examples.AbstractClasses.Abstraction;

public class Main {
    public static void main(String[] args) {
        HttpClient httpClient = new RestClient();
        httpClient.sendRequest("https://blablabla.com", "Hello World");
        httpClient = new SoapClient();
        httpClient.sendRequest("https://blablabla.com", "Hello World");
        httpClient = new ApiClient();
        httpClient.sendRequest("https://blablabla.com", "Hello World");
    }
}
