
package com.bank.pojo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "BrandName",
        "Branch"
})
public class Brand {

    @JsonProperty("BrandName")
    private String brandName;
    @JsonProperty("Branch")
    private List<Branch> branch = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("BrandName")
    public String getBrandName() {
        return brandName;
    }

    @JsonProperty("BrandName")
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @JsonProperty("Branch")
    public List<Branch> getBranch() {
        return branch;
    }

    @JsonProperty("Branch")
    public void setBranch(List<Branch> branch) {
        this.branch = branch;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
