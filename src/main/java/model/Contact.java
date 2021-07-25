package model;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Contact {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("username")
    private String username;
    @JsonProperty("acct")
    private String acct;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("locked")
    private boolean locked;
    @JsonProperty("bot")
    private boolean bot;
    @JsonProperty("discoverable")
    private boolean discoverable;
    @JsonProperty("group")
    private boolean group;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("note")
    private String note;
    @JsonProperty("url")
    private String url;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("avatar_static")
    private String avatarStatic;
    @JsonProperty("header")
    private String header;
    @JsonProperty("header_static")
    private String headerStatic;
    @JsonProperty("followers_count")
    private Integer followersCount;
    @JsonProperty("following_count")
    private Integer followingCount;
    @JsonProperty("statuses_count")
    private Integer statusesCount;
    @JsonProperty("last_status_at")
    private String lastStatusAt;
    @JsonProperty("emojis")
    private List<String>[] emojis;
    @JsonProperty("fields")
    private Fields[] fields;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAcct() {
        return acct;
    }

    public void setAcct(String acct) {
        this.acct = acct;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public boolean isBot() {
        return bot;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
    }

    public boolean isDiscoverable() {
        return discoverable;
    }

    public void setDiscoverable(boolean discoverable) {
        this.discoverable = discoverable;
    }

    public boolean isGroup() {
        return group;
    }

    public void setGroup(boolean group) {
        this.group = group;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatarStatic() {
        return avatarStatic;
    }

    public void setAvatarStatic(String avatarStatic) {
        this.avatarStatic = avatarStatic;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getHeaderStatic() {
        return headerStatic;
    }

    public void setHeaderStatic(String headerStatic) {
        this.headerStatic = headerStatic;
    }

    public Integer getFollowersCount() {
        return followersCount;
    }

    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    public Integer getFollowingCount() {
        return followingCount;
    }

    public void setFollowingCount(Integer followingCount) {
        this.followingCount = followingCount;
    }

    public Integer getStatusesCount() {
        return statusesCount;
    }

    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    public String getLastStatusAt() {
        return lastStatusAt;
    }

    public void setLastStatusAt(String lastStatusAt) {
        this.lastStatusAt = lastStatusAt;
    }

    public List<String>[] getEmojis() {
        return emojis;
    }

    public void setEmojis(List<String>[] emojis) {
        this.emojis = emojis;
    }

    public Fields[] getFields() {
        return fields;
    }

    public void setFields(Fields[] fields) {
        this.fields = fields;
    }
}
