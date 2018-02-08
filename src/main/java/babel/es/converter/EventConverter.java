package babel.es.converter;

import babel.es.domain.EventDomain;
import babel.es.entity._graph;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Jose Luis Martin Rodriguez
 * Clase de conversion de eventos
 */
@Component
public class EventConverter {

    //inicializamos el dozer con el bean generado en DozerConfiguration
    @Autowired
    @Qualifier("org.dozer.Mapper")
    private DozerBeanMapper mapper;

    /**
     * COnversion de objeto json a domain
     * @param event Objeto con informacion de un evento
     * @return domain con informacion esencialo y estructura simplificada
     */
    public EventDomain convertEntityToDomain(_graph event){
        //convertimos de un objeto a otro, los nombres que coincidan y los mapeos de dozer_mapping.xml
        return mapper.map(event,EventDomain.class);
    }

    public void setMapper(DozerBeanMapper mapper) {
        this.mapper = mapper;
    }
}
