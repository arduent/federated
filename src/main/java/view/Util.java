package view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Util {

    public static String fetchUrl(URL url) {

        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            List<String> contents = new ArrayList<>();
            String line;
            while ((line = in.readLine()) != null) {
                contents.add(line);
            }
            in.close();
            return String.join("\n", contents);
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }

        return null;
    }

}
