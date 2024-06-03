package banco.service;

import banco.model.*;
import banco.service.utilidades.ParametrosInvalidosException;

import java.util.List;

public class ContaCorrenteService {
    Cliente cliente;
    ContaCorrente contaCorrente = new ContaCorrente(cliente);
    List<ContaCorrente> listaContas;

    public Double consultarSaldo(){
       return contaCorrente.getSaldo();
    }

    public void depositar(Double valor){
    if(valor != null && valor > 0){
    contaCorrente.deposito(valor);
    }else {
        ParametrosInvalidosException e = null;
        System.out.println(e.getMessage());
    }
    }
    public void sacar(Double valor){
        if(valor != null && valor > 0 && valor <= contaCorrente.getSaldo()){
            contaCorrente.deposito(valor);
        }else {
            ParametrosInvalidosException e = null;
            e.setMessage("Saldo insuficiente ou parametros invalidos.");
            System.out.println(e.getMessage());
            e.setMessage("ParametrosInvalidos: " + e.getMessage());
        }
    }

    public Conta pesquisarContasPorNumero(int numero){
        ParametrosInvalidosException e = null;
            for(Conta c: listaContas){
                if (c.getNumero() == numero){
                    return c;
                }else {
                    System.out.println(e.getMessage());
                    return null; }

        }return null;
    }
    public void transferir(Conta conta, Double valor){
        if (listaContas.isEmpty()){
           if (pesquisarContasPorNumero(conta.getNumero())!=null){
               contaCorrente.transferencia(conta,valor);
           }
        }
    }
//  Futuras implementações:

//    List<String> historico(){
//        List<String> movimentacoes = new ArrayList<>();
//        return movimentacoes;
//    }
//    List<String> historicoDeSaque(){
//        List<String> movimentacoes = new ArrayList<>();
//        return movimentacoes;
//    }
//    List<String> historicoDeDeposito(){
//        List<String> movimentacoes = new ArrayList<>();
//        return movimentacoes;
//    }
//    List<String> historicoDeTranferencias(){
//        List<String> movimentacoes = new ArrayList<>();
//        return movimentacoes;
//    }

}
