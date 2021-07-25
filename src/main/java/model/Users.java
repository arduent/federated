package model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Users {
    @JsonProperty("total")
    private Integer total;
    @JsonProperty("activeMonth")
    private Integer activeMonth;
    @JsonProperty("activeHalfyear")
    private Integer activeHalfYear;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getActiveMonth() {
        return activeMonth;
    }

    public void setActiveMonth(Integer activeMonth) {
        this.activeMonth = activeMonth;
    }

    public Integer getActiveHalfYear() {
        return activeHalfYear;
    }

    public void setActiveHalfYear(Integer activeHalfYear) {
        this.activeHalfYear = activeHalfYear;
    }
}
