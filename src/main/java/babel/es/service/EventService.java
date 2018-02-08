package babel.es.service;

import babel.es.converter.EventConverter;
import babel.es.domain.EventDomain;
import babel.es.entity.Event;
import babel.es.exception.EventException;
import babel.es.rest.RestApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * @author Jose Luis Martin Rodriguez
 */
@Service
public class EventService {

    //log para mostrar informacion
    Logger LOG = Logger.getLogger(getClass().getName());

    @Autowired
    private RestApi restApi;
    @Autowired
    private EventConverter eventConverter;

    /**
     * Llamamos al api y convertimos
     * @return Lista con domain de los eventos
     * @throws EventException
     */
    public List<EventDomain> getEvents() throws EventException {

        List<EventDomain> events;

        try {
            Event events100 = restApi.getEvents100();
            //realizamos un map, el cual va a devolver cada objeto en el lambda para despues almacenarlo en una lista
            events = events100.get_graph().stream().map(event -> eventConverter.convertEntityToDomain(event)).collect(Collectors.toList());
        }catch (EventException e){
            throw e;
        }
        catch (Exception e){
            LOG.info("Error: "+e.toString());
            throw new EventException(EventException.Errors.CONVERTER,e.getMessage());
        }
        return events;
    }
}
