
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
    "Identification",
    "SequenceNumber",
    "Name",
    "Type",
    "CustomerSegment",
    "Accessibility",
    "OtherServiceAndFacility",
    "Availability",
    "ContactInfo",
    "PostalAddress"
})
public class Branch {

    @JsonProperty("Identification")
    private String identification;
    @JsonProperty("SequenceNumber")
    private String sequenceNumber;
    @JsonProperty("Name")
    private String name;
    @JsonProperty("Type")
    private String type;
    @JsonProperty("CustomerSegment")
    private List<String> customerSegment = null;
    @JsonProperty("Accessibility")
    private List<String> accessibility = null;
    @JsonProperty("OtherServiceAndFacility")
    private List<OtherServiceAndFacility> otherServiceAndFacility = null;
    @JsonProperty("Availability")
    private Availability availability;
    @JsonProperty("ContactInfo")
    private List<ContactInfo> contactInfo = null;
    @JsonProperty("PostalAddress")
    private PostalAddress postalAddress;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Identification")
    public String getIdentification() {
        return identification;
    }

    @JsonProperty("Identification")
    public void setIdentification(String identification) {
        this.identification = identification;
    }

    @JsonProperty("SequenceNumber")
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    @JsonProperty("SequenceNumber")
    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("Type")
    public String getType() {
        return type;
    }

    @JsonProperty("Type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("CustomerSegment")
    public List<String> getCustomerSegment() {
        return customerSegment;
    }

    @JsonProperty("CustomerSegment")
    public void setCustomerSegment(List<String> customerSegment) {
        this.customerSegment = customerSegment;
    }

    @JsonProperty("Accessibility")
    public List<String> getAccessibility() {
        return accessibility;
    }

    @JsonProperty("Accessibility")
    public void setAccessibility(List<String> accessibility) {
        this.accessibility = accessibility;
    }

    @JsonProperty("OtherServiceAndFacility")
    public List<OtherServiceAndFacility> getOtherServiceAndFacility() {
        return otherServiceAndFacility;
    }

    @JsonProperty("OtherServiceAndFacility")
    public void setOtherServiceAndFacility(List<OtherServiceAndFacility> otherServiceAndFacility) {
        this.otherServiceAndFacility = otherServiceAndFacility;
    }

    @JsonProperty("Availability")
    public Availability getAvailability() {
        return availability;
    }

    @JsonProperty("Availability")
    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    @JsonProperty("ContactInfo")
    public List<ContactInfo> getContactInfo() {
        return contactInfo;
    }

    @JsonProperty("ContactInfo")
    public void setContactInfo(List<ContactInfo> contactInfo) {
        this.contactInfo = contactInfo;
    }

    @JsonProperty("PostalAddress")
    public PostalAddress getPostalAddress() {
        return postalAddress;
    }

    @JsonProperty("PostalAddress")
    public void setPostalAddress(PostalAddress postalAddress) {
        this.postalAddress = postalAddress;
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
