package babel.es.converter;

import org.dozer.DozerBeanMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;

/**
 * @author Jose Luis Martin Rodriguez
 * Clase de configuracion
 */
@Configuration
public class DozerConfiguration {

    /**
     * Inicializacion de dozer
     * @return dozer con configuracion xml
     */
    @Bean(name = "org.dozer.Mapper")
    public DozerBeanMapper dozerBean() {
        //configuramos los mapeos
        List<String> mappingFiles = Arrays.asList("dozer_mapping.xml");

        DozerBeanMapper dozerBean = new DozerBeanMapper();
        dozerBean.setMappingFiles(mappingFiles);
        return dozerBean;
    }
}
