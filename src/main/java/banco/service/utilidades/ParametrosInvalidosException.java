package banco.service.utilidades;

import lombok.Setter;

@Setter
public class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String message) {
        super(message);
    }

    @Override
    public String toString() {
        return "ParametrosInvalidos: " + this.getMessage();
    }

    @Override
    public String getMessage() {
        return "Erro: " + super.getMessage();
    }

    public String setMessage(String mensagem){
        return this.setMessage(mensagem);
    }
}
