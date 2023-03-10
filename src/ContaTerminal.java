import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ContaTerminal {
    public static void main(String[] args) throws Exception{
        //Metodo Scanner instanciado para conseguirmos ler os dados inseridos pelo usuario
        Scanner scanner = new Scanner(System.in);

        //Cabeçalho para deixar o programa bonito
        System.out.println("---------------------------------------");
        System.out.println("------CRIAÇÃO DE CONTA NO BANCO--------");
        System.out.println("---------------------------------------");

        //Entrada de dados do usuario
        System.out.print("Digite seu Nome Completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o numero da Conta: ");
        int conta = scanner.nextInt();

        System.out.print("Digite a Agencia: ");
        String agencia = scanner.next();

        System.out.print("Digite o Saldo: ");
        double saldo = scanner.nextDouble();

        //Olá [Nome Cliente], obrigado por criar uma conta em nosso banco, sua agência é [Agencia], conta [Numero] e seu saldo [Saldo] já está disponível para saque.
        //Mensagem para exibir quando criada a conta do cliente..

        System.out.println("---------------------------------------");
        System.out.println("------CONTA CRIADA COM SUCESSO---------");
        System.out.println("---------------------------------------");
        System.out.println("Olá " .concat(nome).concat(", obrigado por criar uma conta em nosso banco, sua agência é: ".concat(agencia)).concat(", conta é: ".concat(String.valueOf(conta)).concat(" e seu saldo é de: R$".concat(String.valueOf(saldo)).concat(" que já está disponível para saque."))));


    }
}
