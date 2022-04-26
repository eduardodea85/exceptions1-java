package model.exceptions;

public class DomainException extends RuntimeException{ //Runtime não é obrigado a tratar as exceções personalizadas com throws
    private static final long serialVersionUID = 1L;
    
    public DomainException(String msg) {
        super(msg);
    }
    
    
    
}
