import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Network {

    private List<Link> links;

    public Network() {
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> PCELinks) {
        this.links = PCELinks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {

        private final Network network;

        public Builder() {
            network = new Network();
        }

        public Builder withLinks(List<Link> links) {
            network.links = links;
            return this;
        }

        public <T> Builder withLinks(List<T> links, Function<T, Link> mapper) {
            network.links = links.stream().map(mapper).collect(Collectors.toList());
            return this;
        }

        public Network build() {
            return network;
        }
    }
}
