package banco.model;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
public class ContaCorrente extends Conta{
    static Double credito = 300.00;
    public List<ContaCorrente> contasCorrente;
    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

}
