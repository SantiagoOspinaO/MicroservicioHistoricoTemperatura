package co.com.swiii.registrotemperatura.historicotemperatura.model.exception;

public class BusinessException extends RuntimeException {

    public BusinessException(String mensaje){
        super(mensaje);
    }
}
