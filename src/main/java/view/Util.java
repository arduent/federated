package view;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.io.IOException;

public class Util {

    public static String fetchUrl(String url) {

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .header("Accept", "application/activity+json, application/ld+json, application/json")
                    .build();

            HttpResponse<String> response =
                    client.send(request, HttpResponse.BodyHandlers.ofString());

            return response.body();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return null;
    }

}
