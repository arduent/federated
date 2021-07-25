package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Instance {
    @JsonProperty("uri")
    private String uri;
    @JsonProperty("title")
    private String title;
    @JsonProperty("short_description")
    private String shortDescription;
    @JsonProperty("description")
    private String description;
    @JsonProperty("email")
    private String email;
    @JsonProperty("version")
    private String version;
    @JsonProperty("urls")
    private Map<String,String>[] urls;
    @JsonProperty("stats")
    private Map<String,Integer>[] stats;
    @JsonProperty("thumbnail")
    private String thumbnail;
    @JsonProperty("languages")
    private List<String>[] languages;
    @JsonProperty("registrations")
    private boolean registrations;
    @JsonProperty("approval_required")
    private boolean approvalRequired;
    @JsonProperty("invites_enabled")
    private boolean invitesEnabled;
    @JsonProperty("contact_account")
    private Contact contactAccount;
    @JsonProperty("rules")
    private Rules[] rules;

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Map<String, String>[] getUrls() {
        return urls;
    }

    public void setUrls(Map<String, String>[] urls) {
        this.urls = urls;
    }

    public Map<String, Integer>[] getStats() {
        return stats;
    }

    public void setStats(Map<String, Integer>[] stats) {
        this.stats = stats;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String>[] getLanguages() {
        return languages;
    }

    public void setLanguages(List<String>[] languages) {
        this.languages = languages;
    }

    public boolean isRegistrations() {
        return registrations;
    }

    public void setRegistrations(boolean registrations) {
        this.registrations = registrations;
    }

    public boolean isApprovalRequired() {
        return approvalRequired;
    }

    public void setApprovalRequired(boolean approvalRequired) {
        this.approvalRequired = approvalRequired;
    }

    public boolean isInvitesEnabled() {
        return invitesEnabled;
    }

    public void setInvitesEnabled(boolean invitesEnabled) {
        this.invitesEnabled = invitesEnabled;
    }

    public Contact getContactAccount() {
        return contactAccount;
    }

    public void setContactAccount(Contact contactAccount) {
        this.contactAccount = contactAccount;
    }

    public Rules[] getRules() {
        return rules;
    }

    public void setRules(Rules[] rules) {
        this.rules = rules;
    }
}
