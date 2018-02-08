
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
    "@id",
    "@type",
    "id",
    "title",
    "description",
    "price",
    "dtstart",
    "dtend",
    "excluded-days",
    "recurrence",
    "uid",
    "link",
    "event-location",
    "references",
    "relation",
    "address",
    "location"
})
public class _graph {

    @JsonProperty("@id")
    private String _id;
    @JsonProperty("@type")
    private String _type;
    @JsonProperty("id")
    private String id;
    @JsonProperty("title")
    private String title;
    @JsonProperty("description")
    private String description;
    @JsonProperty("price")
    private Integer price;
    @JsonProperty("dtstart")
    private String dtstart;
    @JsonProperty("dtend")
    private String dtend;
    @JsonProperty("excluded-days")
    private String excluded_days;
    @JsonProperty("recurrence")
    private Recurrence recurrence;
    @JsonProperty("uid")
    private String uid;
    @JsonProperty("link")
    private String link;
    @JsonProperty("event-location")
    private String event_location;
    @JsonProperty("references")
    private References references;
    @JsonProperty("relation")
    private Relation relation;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("location")
    private Location location;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@id")
    public String get_id() {
        return _id;
    }

    @JsonProperty("@id")
    public void set_id(String _id) {
        this._id = _id;
    }

    @JsonProperty("@type")
    public String get_type() {
        return _type;
    }

    @JsonProperty("@type")
    public void set_type(String _type) {
        this._type = _type;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("price")
    public Integer getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(Integer price) {
        this.price = price;
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

    @JsonProperty("recurrence")
    public Recurrence getRecurrence() {
        return recurrence;
    }

    @JsonProperty("recurrence")
    public void setRecurrence(Recurrence recurrence) {
        this.recurrence = recurrence;
    }

    @JsonProperty("uid")
    public String getUid() {
        return uid;
    }

    @JsonProperty("uid")
    public void setUid(String uid) {
        this.uid = uid;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    @JsonProperty("event-location")
    public String getEvent_location() {
        return event_location;
    }

    @JsonProperty("event-location")
    public void setEvent_location(String event_location) {
        this.event_location = event_location;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    @JsonProperty("relation")
    public Relation getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
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
