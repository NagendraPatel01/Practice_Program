package com.example.apicallingpractice.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PopulationModel {

    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("alpha_two_code")
    @Expose
    private String alphaTwoCode;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state-province")
    @Expose
    private Object stateProvince;
    @SerializedName("domains")
    @Expose
    private List<String> domains;
    @SerializedName("web_pages")
    @Expose
    private List<String> webPages;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAlphaTwoCode() {
        return alphaTwoCode;
    }

    public void setAlphaTwoCode(String alphaTwoCode) {
        this.alphaTwoCode = alphaTwoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(Object stateProvince) {
        this.stateProvince = stateProvince;
    }

    public List<String> getDomains() {
        return domains;
    }

    public void setDomains(List<String> domains) {
        this.domains = domains;
    }

    public List<String> getWebPages() {
        return webPages;
    }

    public void setWebPages(List<String> webPages) {
        this.webPages = webPages;
    }

}