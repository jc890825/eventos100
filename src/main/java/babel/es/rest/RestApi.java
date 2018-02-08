package babel.es.rest;

import babel.es.entity.Event;
import babel.es.exception.EventException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author Jose Luis Martin Rodriguez
 */
@Service
public class RestApi {

    private static final String URL_BASE = "https://datos.madrid.es/egob/catalogo/";
    private static final String URL_EVENTOS_100 = "206974-0-agenda-eventos-culturales-100.json";

    @Autowired
    private RestTemplate restTemplate;

    /**
     * Llamada al api de Madrid
     * @return Dato Autogenerado del json
     * @throws EventException Si existe algun error en la recuperacion del json o en su conversion
     */
    public Event getEvents100() throws EventException {
        try {

            //recuperamos el result en formato string
            String json = restTemplate.getForObject(URL_BASE.concat(URL_EVENTOS_100), String.class);
            ObjectMapper mapper = new ObjectMapper();
            //errores con caracteres no esperados
            mapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_CONTROL_CHARS, true);
            mapper.configure(JsonParser.Feature.ALLOW_BACKSLASH_ESCAPING_ANY_CHARACTER, true);
            //convertimos al objeto deseado
            return mapper.readValue(json, Event.class);
        } catch (Exception e) {
            throw new EventException(EventException.Errors.REST,e.getMessage());
        }
    }

    //inicializamos restTemplate para su uso en cualquier lugar
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public void setRestTemplate(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
}
