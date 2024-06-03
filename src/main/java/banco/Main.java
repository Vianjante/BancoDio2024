package banco;

import banco.controler.ContaCorrenteControler;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean app = false;
        while (!app) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Olá, selecione uma das opções a seguir: ");
            System.out.println("1- ContaCorrente");
            System.out.println("2- Conta poupança");
            System.out.println("3- Conta salario");
            Integer opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    ContaCorrenteControler.main(args);
                    break;
                case 2:
                    System.out.println("opção temporariamente suapensa.");
                    break;
                case 3:
                    System.out.println("opção temporariamente suspensa.");
                    break;
                default:
                    System.out.println("Opção invalida!");
                    break;
            }scanner.close();
        }
//        Cliente cliente = new Cliente();
//        cliente.setNome("Victor");
//        OperacoesConta operacoesConta = new OperacoesConta();
//        operacoesConta.depositar(50.00);
    }
}