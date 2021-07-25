package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Usage {
    @JsonProperty("users")
    private Users users;
    @JsonProperty("localPosts")
    private Integer localPosts;

    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }

    public Integer getLocalPosts() {
        return localPosts;
    }

    public void setLocalPosts(Integer localPosts) {
        this.localPosts = localPosts;
    }
}
