
package com.bank.pojo;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "GeographicCoordinates"
})
public class GeoLocation {

    @JsonProperty("GeographicCoordinates")
    private GeographicCoordinates geographicCoordinates;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("GeographicCoordinates")
    public GeographicCoordinates getGeographicCoordinates() {
        return geographicCoordinates;
    }

    @JsonProperty("GeographicCoordinates")
    public void setGeographicCoordinates(GeographicCoordinates geographicCoordinates) {
        this.geographicCoordinates = geographicCoordinates;
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
