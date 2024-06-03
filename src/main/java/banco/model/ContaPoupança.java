package banco.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ContaPoupança extends Conta{
    static int limiteSaqueMes = 5;
    public ContaPoupança(Cliente cliente) {
        super(cliente);
    }

}
