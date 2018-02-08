
package babel.es.entity;

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
    "c",
    "dcterms",
    "geo",
    "loc",
    "org",
    "vcard",
    "title",
    "id",
    "relation",
    "references",
    "address",
    "area",
    "district",
    "locality",
    "postal-code",
    "street",
    "location",
    "latitude",
    "longitude",
    "organization",
    "organization-desc",
    "accesibility",
    "services",
    "schedule",
    "organization-name",
    "description",
    "link",
    "uid",
    "dtstart",
    "dtend",
    "excluded-days",
    "event-location",
    "price",
    "recurrence",
    "days",
    "frequency",
    "interval",
    "audience"
})
public class _context {

    @JsonProperty("c")
    private String c;
    @JsonProperty("dcterms")
    private String dcterms;
    @JsonProperty("geo")
    private String geo;
    @JsonProperty("loc")
    private String loc;
    @JsonProperty("org")
    private String org;
    @JsonProperty("vcard")
    private String vcard;
    @JsonProperty("title")
    private String title;
    @JsonProperty("id")
    private String id;
    @JsonProperty("relation")
    private String relation;
    @JsonProperty("references")
    private String references;
    @JsonProperty("address")
    private String address;
    @JsonProperty("area")
    private String area;
    @JsonProperty("district")
    private String district;
    @JsonProperty("locality")
    private String locality;
    @JsonProperty("postal-code")
    private String postal_code;
    @JsonProperty("street")
    private String street;
    @JsonProperty("location")
    private String location;
    @JsonProperty("latitude")
    private String latitude;
    @JsonProperty("longitude")
    private String longitude;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("organization-desc")
    private String organization_desc;
    @JsonProperty("accesibility")
    private String accesibility;
    @JsonProperty("services")
    private String services;
    @JsonProperty("schedule")
    private String schedule;
    @JsonProperty("organization-name")
    private String organization_name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("link")
    private String link;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("dtstart")
    private String dtstart;
    @JsonProperty("dtend")
    private String dtend;
    @JsonProperty("excluded-days")
    private String excluded_days;
    @JsonProperty("event-location")
    private String event_location;
    @JsonProperty("price")
    private String price;
    @JsonProperty("recurrence")
    private String recurrence;
    @JsonProperty("days")
    private String days;
    @JsonProperty("frequency")
    private String frequency;
    @JsonProperty("interval")
    private String interval;
    @JsonProperty("audience")
    private String audience;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("c")
    public String getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(String c) {
        this.c = c;
    }

    @JsonProperty("dcterms")
    public String getDcterms() {
        return dcterms;
    }

    @JsonProperty("dcterms")
    public void setDcterms(String dcterms) {
        this.dcterms = dcterms;
    }

    @JsonProperty("geo")
    public String getGeo() {
        return geo;
    }

    @JsonProperty("geo")
    public void setGeo(String geo) {
        this.geo = geo;
    }

    @JsonProperty("loc")
    public String getLoc() {
        return loc;
    }

    @JsonProperty("loc")
    public void setLoc(String loc) {
        this.loc = loc;
    }

    @JsonProperty("org")
    public String getOrg() {
        return org;
    }

    @JsonProperty("org")
    public void setOrg(String org) {
        this.org = org;
    }

    @JsonProperty("vcard")
    public String getVcard() {
        return vcard;
    }

    @JsonProperty("vcard")
    public void setVcard(String vcard) {
        this.vcard = vcard;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("relation")
    public String getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(String relation) {
        this.relation = relation;
    }

    @JsonProperty("references")
    public String getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(String references) {
        this.references = references;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("area")
    public String getArea() {
        return area;
    }

    @JsonProperty("area")
    public void setArea(String area) {
        this.area = area;
    }

    @JsonProperty("district")
    public String getDistrict() {
        return district;
    }

    @JsonProperty("district")
    public void setDistrict(String district) {
        this.district = district;
    }

    @JsonProperty("locality")
    public String getLocality() {
        return locality;
    }

    @JsonProperty("locality")
    public void setLocality(String locality) {
        this.locality = locality;
    }

    @JsonProperty("postal-code")
    public String getPostal_code() {
        return postal_code;
    }

    @JsonProperty("postal-code")
    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    @JsonProperty("street")
    public String getStreet() {
        return street;
    }

    @JsonProperty("street")
    public void setStreet(String street) {
        this.street = street;
    }

    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(String location) {
        this.location = location;
    }

    @JsonProperty("latitude")
    public String getLatitude() {
        return latitude;
    }

    @JsonProperty("latitude")
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    @JsonProperty("longitude")
    public String getLongitude() {
        return longitude;
    }

    @JsonProperty("longitude")
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonProperty("organization-desc")
    public String getOrganization_desc() {
        return organization_desc;
    }

    @JsonProperty("organization-desc")
    public void setOrganization_desc(String organization_desc) {
        this.organization_desc = organization_desc;
    }

    @JsonProperty("accesibility")
    public String getAccesibility() {
        return accesibility;
    }

    @JsonProperty("accesibility")
    public void setAccesibility(String accesibility) {
        this.accesibility = accesibility;
    }

    @JsonProperty("services")
    public String getServices() {
        return services;
    }

    @JsonProperty("services")
    public void setServices(String services) {
        this.services = services;
    }

    @JsonProperty("schedule")
    public String getSchedule() {
        return schedule;
    }

    @JsonProperty("schedule")
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    @JsonProperty("organization-name")
    public String getOrganization_name() {
        return organization_name;
    }

    @JsonProperty("organization-name")
    public void setOrganization_name(String organization_name) {
        this.organization_name = organization_name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("dtstart")
    public String getDtstart() {
        return dtstart;
    }

    @JsonProperty("dtstart")
    public void setDtstart(String dtstart) {
        this.dtstart = dtstart;
    }

    @JsonProperty("dtend")
    public String getDtend() {
        return dtend;
    }

    @JsonProperty("dtend")
    public void setDtend(String dtend) {
        this.dtend = dtend;
    }

    @JsonProperty("excluded-days")
    public String getExcluded_days() {
        return excluded_days;
    }

    @JsonProperty("excluded-days")
    public void setExcluded_days(String excluded_days) {
        this.excluded_days = excluded_days;
    }

    @JsonProperty("event-location")
    public String getEvent_location() {
        return event_location;
    }

    @JsonProperty("event-location")
    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("recurrence")
    public String getRecurrence() {
        return recurrence;
    }

    @JsonProperty("recurrence")
    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    @JsonProperty("days")
    public String getDays() {
        return days;
    }

    @JsonProperty("days")
    public void setDays(String days) {
        this.days = days;
    }

    @JsonProperty("frequency")
    public String getFrequency() {
        return frequency;
    }

    @JsonProperty("frequency")
    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
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
