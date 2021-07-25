package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NodeInfo {
    @JsonProperty("version")
    private String version;
    @JsonProperty("software")
    private Software software;
    @JsonProperty("protocols")
    private List<String>[] protocols;
    @JsonProperty("usage")
    private Usage usage;
    @JsonProperty("openRegistrations")
    private boolean openRegistrations;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Software getSoftware() {
        return software;
    }

    public void setSoftware(Software software) {
        this.software = software;
    }

    public List<String>[] getProtocols() {
        return protocols;
    }

    public void setProtocols(List<String>[] protocols) {
        this.protocols = protocols;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }

    public boolean isOpenRegistrations() {
        return openRegistrations;
    }

    public void setOpenRegistrations(boolean openRegistrations) {
        this.openRegistrations = openRegistrations;
    }
}
