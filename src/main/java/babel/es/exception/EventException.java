package babel.es.exception;

/**
 * @author Jose Luis Martin Rodriguez
 * Excepcion general para eventos
 */
public class EventException extends Exception{

    /**
     * 100 Error en la llamada rest
     * 101 Error en la conversion
     */
    public enum Errors{
        REST(100,"Error al obtener datos de Eventos"),
        CONVERTER(101,"Error al realizar la conversion de datos");

        private int value;
        private String message;
        private Errors(int value,String message) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }

        public String getMessage() {
            return message;
        }
    }

    private Errors error;

    public EventException(Errors error, String messageDefault) {
        super(messageDefault);
        this.error = error;

    }
}
