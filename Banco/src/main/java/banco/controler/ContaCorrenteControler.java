package banco.controler;

import banco.model.Cliente;
import banco.model.ContaCorrente;
import banco.service.ContaCorrenteService;

import java.util.List;
import java.util.Scanner;

public class ContaCorrenteControler {

    public static void main(String[] args) {
        ContaCorrenteService service = new ContaCorrenteService();
        Cliente cliente = new Cliente();
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Victor");
        Cliente cliente2 = new Cliente();
        cliente1.setNome("João");
        Cliente cliente3 = new Cliente();
        cliente1.setNome("Mario");
        ContaCorrente contaCorrente = new ContaCorrente(cliente);
        ContaCorrente conta1 = new ContaCorrente(cliente1);
        ContaCorrente conta2 = new ContaCorrente(cliente1);
        ContaCorrente conta3 = new ContaCorrente(cliente1);
        List<ContaCorrente> listacontasCorrente;
        boolean condicao = true;
        Scanner scanner = new Scanner(System.in);
        while (condicao) {
                System.out.println("Informe a operação que deseja realizar: ");
                System.out.println("1-Deposito");
                System.out.println("2-Transferencia");
                System.out.println("3-Saque");
                System.out.println("4-Cosultar saldo");
                System.out.println("5-Sair");
                Integer opcao  = scanner.nextInt();
                double valor ;
                switch (opcao) {
                    case 1:
                        System.out.println("Informe o valor a ser depositado: R$");
                         valor = scanner.nextDouble();


                        try {
                            System.out.println("Valor a ser depositado: R$ " + valor);
                            service.depositar(valor);
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida. Por favor, insira um número válido.");
                        }

                        break;
                    case 2:
                        System.out.println("operação temporariamente suspensa!");
//                        System.out.println("Informe o valor da transferencia: \n R$");
//                         valor = scanner.nextDouble();
//                        Double saldo = service.consultarSaldo();
//                        if (saldo >= valor) {
//                            System.out.println("Inforfome o número da conta para a qual deseja realiizar a transferencia: ");
//                            Integer numero = scanner.nextInt();
//                            if ( service.pesquisarContasPorNumero(numero) != null){
//                                System.out.println("tranferencia realizada com sucesso!");
//                            }else{
//                                System.out.println("conta não encontrada");
//                            }
//                        }
//                        break;
                    case 3:
                        System.out.println("Informe o valor a ser sacado: R$");
                        valor = scanner.nextDouble();
                        service.sacar(valor);
                        break;
                    case 4:
                        System.out.println("Seu saldo é: R$"+service.consultarSaldo());
                    break;
                    case 5:
                        condicao =false;
                        break;
                        default:
                        System.out.println("Opção invalida!");
                        break;
                }
            }


    }
}
