package view;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.Instance;

import java.io.IOException;
import java.net.URL;

public class ApiV1InstanceReader {

    public static void run(String dom) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

            URL url = new URL(dom + "/api/v1/instance");

            String contents = Util.fetchUrl(url);

            Instance instance = mapper.readValue(contents, Instance.class);
            String prettyInstance = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(instance);
            System.out.println(prettyInstance);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
