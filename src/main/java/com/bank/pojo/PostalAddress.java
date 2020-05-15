
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
    "AddressLine",
    "TownName",
    "CountrySubDivision",
    "Country",
    "PostCode",
    "GeoLocation"
})
public class PostalAddress {

    @JsonProperty("AddressLine")
    private List<String> addressLine = null;
    @JsonProperty("TownName")
    private String townName;
    @JsonProperty("CountrySubDivision")
    private List<String> countrySubDivision = null;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("PostCode")
    private String postCode;
    @JsonProperty("GeoLocation")
    private GeoLocation geoLocation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("AddressLine")
    public List<String> getAddressLine() {
        return addressLine;
    }

    @JsonProperty("AddressLine")
    public void setAddressLine(List<String> addressLine) {
        this.addressLine = addressLine;
    }

    @JsonProperty("TownName")
    public String getTownName() {
        return townName;
    }

    @JsonProperty("TownName")
    public void setTownName(String townName) {
        this.townName = townName;
    }

    @JsonProperty("CountrySubDivision")
    public List<String> getCountrySubDivision() {
        return countrySubDivision;
    }

    @JsonProperty("CountrySubDivision")
    public void setCountrySubDivision(List<String> countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("PostCode")
    public String getPostCode() {
        return postCode;
    }

    @JsonProperty("PostCode")
    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    @JsonProperty("GeoLocation")
    public GeoLocation getGeoLocation() {
        return geoLocation;
    }

    @JsonProperty("GeoLocation")
    public void setGeoLocation(GeoLocation geoLocation) {
        this.geoLocation = geoLocation;
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
