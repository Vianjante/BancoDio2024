package banco.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
@EqualsAndHashCode
public  abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    protected LocalDateTime dataOperacao;
    DateTimeFormatter formatoDataTempo = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public List<Conta> contas;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }
    public Double consultarSaldo(){
        return saldo;
    }

    public void saque( Double valor){
        dataOperacao = LocalDateTime.now();
        saldo -= valor;
    }
    public void deposito(Double valor){
        saldo+=  valor;
    }
    public  void transferencia(Conta destino, Double valor) {
        dataOperacao = LocalDateTime.now();
        this.saldo -= valor;
        destino.deposito(valor);
        // formata data e hora da operação
    }

}
