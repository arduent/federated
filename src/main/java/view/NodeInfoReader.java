package view;

import model.Links;
import model.NodeInfo;
import model.NodeInfoPath;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;



public class NodeInfoReader {

    public static void run(String dom) {

        try {

            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);
            mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            mapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
            mapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);

            String contents = Util.fetchUrl(dom + "/.well-known/nodeinfo");
            NodeInfoPath nodeInfoPath = mapper.readValue(contents, NodeInfoPath.class);
            Links[] links = nodeInfoPath.getLinks();
            Links link = links[0];
            String href = link.getHref();

            String infoContents = Util.fetchUrl(href);
            NodeInfo nodeInfo = mapper.readValue(infoContents, NodeInfo.class);
            String prettyInstance = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(nodeInfo);
            System.out.println(prettyInstance);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
