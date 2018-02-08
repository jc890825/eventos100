package babel.es.builder;

import babel.es.ParentTest;
import babel.es.domain.EventDomain;
import babel.es.entity._graph;
import babel.es.entity._graph;
import java.time.LocalDateTime;

public class EventDomainBuilder {

    public static EventDomain buildDomain() {
        return new EventDomain("100", "Titulo de evento",
                "Descripcion del evento",
                1,
                "07/05/2018", "07/06/2018",
                "link.es",
                "Localizacion evento");
    }

    public static _graph buildGraph(){
        EventDomain domain = buildDomain();
        _graph graph = new _graph();
        graph.setId(domain.getId());
        graph.setDescription(domain.getDescription());
        graph.setPrice(domain.getPrice());
        graph.setDtstart(domain.getStartDate().toString());
        graph.setDtend(domain.getEndDate().toString());
        graph.setLink(domain.getLink());
        graph.setEvent_location(domain.getLocation());

        return graph;
    }
}
