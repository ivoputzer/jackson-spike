import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BaseModelTest {

    @Test
    public void test() throws Exception {
        String json = "{\"links\": [{\"a\": 1}, {\"a\": 2}, {\"a\": 3}]}";

        ObjectMapper mapper = new ObjectMapper();
        JSONNetwork JSONNetwork = mapper.readValue(json, JSONNetwork.class);

        Network network = NetworkFactory.buildFromNCMS(JSONNetwork);

        assertEquals(network.getLinks().size(), 3);
        assertEquals(network.getLinks().get(0).getB(), 1);
    }
}