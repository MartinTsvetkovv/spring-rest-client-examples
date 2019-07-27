package com.mtsvetkov.springrestclientexamples.domain.entities;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Job implements Serializable {
    private String title;
    private String company;
    private Map<String, Object> additionalProperties;

    public Job() {
        this.additionalProperties = new HashMap<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
    }
}
