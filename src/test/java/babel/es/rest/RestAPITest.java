package babel.es.rest;

import babel.es.ParentTest;
import babel.es.entity.Event;

import babel.es.exception.EventException;
import org.apache.commons.io.FileUtils;
import org.junit.Ignore;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.net.URL;
import java.util.logging.Logger;

import static org.junit.Assert.*;

public class RestAPITest extends ParentTest {

    private Logger LOG = Logger.getLogger(getClass().getName());

    @Autowired
    private RestApi restApi;

    private RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
    private RestApi restApiMockito = Mockito.spy(new RestApi());


    @Test
    @Ignore
    /**
     * Test real de llamada
     */
    public void testEventos100Real(){
        try {
            Event events100 = restApi.getEvents100();
            assertNotNull(events100);
            assertFalse(events100.get_graph().isEmpty());
        }catch(Exception e){
            LOG.info("Error:"+e);
            fail();
        }

    }

    @Test
    /**
     * Test con mockito
     */
    public void testEventos100Mockito() {
        try {
            URL fileLocation = getClass().getClassLoader().getResource("resultEvents100.json");
            File file = new File(fileLocation.getFile());
            String json = FileUtils.readFileToString(file);

            Mockito.doReturn(json).when(this.restTemplate).getForObject(Matchers.any(String.class), Matchers.eq(String.class));
            restApiMockito.setRestTemplate(restTemplate);
            Event events100 = restApiMockito.getEvents100();
            assertNotNull(events100);
            assertFalse(events100.get_graph().isEmpty());
            assertTrue(events100.get_graph().size()==2);
            events100.get_graph().stream().forEach(event->{
                assertNotNull(event.getId());
                assertNotNull(event.getPrice());
                assertNotNull(event.getEvent_location());
                assertNotNull(event.getLink());
                assertNotNull(event.getDescription());
                assertNotNull(event.getDtend());
                assertNotNull(event.getDtstart());
                assertNotNull(event.getTitle());

            });

        } catch (Exception e) {
            LOG.info("Error:" + e);
            fail();
        }

    }

    @Test(expected = EventException.class)
    /**
     * Test con mockito
     */
    public void testEventos100MockitoError() throws EventException {


            Mockito.doReturn("").when(this.restTemplate).getForObject(Matchers.any(String.class), Matchers.eq(String.class));
            restApiMockito.setRestTemplate(restTemplate);
            restApiMockito.getEvents100();
            fail();
    }
}
