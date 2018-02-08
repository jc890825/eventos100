package babel.es.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.time.LocalDateTime;

/**
 * @author Jose Luis Martin Rodriguez
 * Clase Domain
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EventDomain {

    private String id;
    private String title;
    private String description;
    private Integer price;
    private String startDate;
    private String endDate;
    private String link;
    private String location;
}
