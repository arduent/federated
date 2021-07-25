package view;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Instance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

import java.util.ArrayList;
import java.util.List;

public class ApiV1InstanceReader {

    public static void main(String[] args) {

        try {

            String content = null;
            //String dom = "https://zap.dog";
            //String dom = "https://solopor.com";
            String dom = "https://mastodon.social";

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

            URL url = new URL(dom + "/api/v1/instance");
//            /nodeinfo/2.0.json
//            /nodeinfo/2.0
//            /.well-known/nodeinfo

            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            List<String> contents = new ArrayList<>();
            String line;
            while ((line = in.readLine()) != null) {
                contents.add(line);
            }
            in.close();
            Instance instance = mapper.readValue(String.join("\n", contents), Instance.class);
            String prettyInstance = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(instance);
            System.out.println(prettyInstance);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
