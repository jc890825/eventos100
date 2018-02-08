package babel.es.converter;

import babel.es.ParentTest;
import babel.es.builder.EventDomainBuilder;
import babel.es.domain.EventDomain;
import babel.es.entity._graph;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.logging.Logger;
import static org.junit.Assert.fail;

public class EventConverterTest extends ParentTest {

    Logger LOG = Logger.getLogger(getClass().getName());
    private EventDomain domain;

    @Autowired
    private EventConverter eventConverter;

    @Before
    public void before() {
        domain = EventDomainBuilder.buildDomain();
    }

    @Test
    public void converter() {
        try {
            _graph event = EventDomainBuilder.buildGraph();
            EventDomain eventDomain = eventConverter.convertEntityToDomain(event);
            Assert.assertNotNull(eventDomain);
            Assert.assertEquals(event.getId(), domain.getId());
            Assert.assertEquals(event.getDescription(), domain.getDescription());
            Assert.assertEquals(event.getLink(), domain.getLink());
            Assert.assertEquals(event.getEvent_location(), domain.getLocation());
            Assert.assertEquals(event.getPrice(), domain.getPrice());
        } catch (Exception e) {
            LOG.info("Error:"+e.toString());
            fail();
        }

    }
}
