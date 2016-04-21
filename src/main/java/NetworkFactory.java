public class NetworkFactory {

    public static Network buildFromNCMS(JSONNetwork JSONNetwork) {
        return Network.builder()
                .withLinks(JSONNetwork.getLinks(), LinkFactory.fromNCMS())
                .build();
    }

}
