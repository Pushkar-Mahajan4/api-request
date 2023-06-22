import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Request {
    public static void main(String args[]){
        String address = "https://www.google.co.in/";
        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = (HttpRequest) HttpRequest.newBuilder()
                                    .GET()
                                    .header("accept", "text/html")
                                    .uri(URI.create(address))
                                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.body());                        

        }
        catch(Exception e){
            e.printStackTrace();
        }


    }
}
