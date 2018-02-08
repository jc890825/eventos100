
package babel.es.controller;

import babel.es.domain.EventDomain;
import babel.es.exception.EventException;
import babel.es.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;



/**@author Jose Luis Martin Rodriguez
 * @version 0.0.1
 * MVC. Capa de controlador, solo se deben de hacer llamadas a los servicios
 * COntrolador para mostrar informacion a traves de llamadas get.
 */
@RestController
public class EventController     {

    @Autowired
    private EventService eventService;

    /**
     * Llamada a /events para devolver informacion de eventos
     * @return Lista de dominios convertidos a json
     * @throws EventException
     */
    @RequestMapping("/events")
    public List<EventDomain> getEvents() throws EventException {
        return eventService.getEvents();
    }
}
