import java.util.function.Function;

public class LinkFactory {
    public static Link buildFromNCMS(JSONLink JSONLink) {
        Link link = new Link();
        link.setB(JSONLink.getA());
        return link;
    }

    public static Function<JSONLink, Link> fromNCMS() {
        return ncmsLink -> buildFromNCMS(ncmsLink);
    }
}
