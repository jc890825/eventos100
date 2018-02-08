
package babel.es.entity;

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
    "@context",
    "@graph"
})
public class Event {

    @JsonProperty("@context")
    private babel.es.entity._context _context;
    @JsonProperty("@graph")
    private List<babel.es.entity._graph> _graph = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("@context")
    public babel.es.entity._context get_context() {
        return _context;
    }

    @JsonProperty("@context")
    public void set_context(babel.es.entity._context _context) {
        this._context = _context;
    }

    @JsonProperty("@graph")
    public List<babel.es.entity._graph> get_graph() {
        return _graph;
    }

    @JsonProperty("@graph")
    public void set_graph(List<babel.es.entity._graph> _graph) {
        this._graph = _graph;
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
