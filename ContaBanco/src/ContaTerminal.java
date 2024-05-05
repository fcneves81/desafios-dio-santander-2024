import java.util.Locale;
import java.util.Scanner;

/**
* <h1>Desafio 01 - ContaTerminal</h1>
* A ContaTerminal recebe os dados: nome do cliente, conta, agência e saldo inicial e os exibe em tela.
* <p>
* <b>Note:</b> Devido muitos usuários estarem acostumados com a vírgula sendo o separador da parte inteira de um 
* número, primeiramente recebo o valor do saldo como uma string, e utilizo o método replace, alterando a vírgula
* por ponto, para evitar que o sistema pare por erro.
* @author  Fernando Camargo
* @version 1.0
* @since   05/05/2024
*/

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        // Instanciando a classe Scanner para entrada de dados
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        // Inicialização das variáveis
        int conta = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        // Mensagem com nome da instituição
        System.out.println("\n***********************************************************\n");
        System.out.println("                         DIO BANK                           ");
        System.out.println("\n***********************************************************\n");

        // Mensagem pedindo o nome do usuário
        System.out.print("Por favor, nos informe o seu nome: ");
        // Armazenando o nome na variável nomeCliente
        nomeCliente = sc.next();

        // Solicitando a conta
        System.out.print(nomeCliente + ", preciso saber o número da conta: ");
        // Armazenando o número da conta
        conta = sc.nextInt();

        // Solicitando a agência
        System.out.print("Agora, informe sua agencia com o dígito (Ex: 067-8): ");
        // Armazenando a agência
        agencia = sc.next();

        // Solicitanto o depósito inicial
        System.out.print("E qual é o valor do depósito inicial: R$ ");
        // Armazenando o valor em uma string e alterando a "," por "."
        String valor = sc.next().replace(',','.');
        // Transformando o valor da string em double
        saldo = Double.parseDouble(valor);

        // Mensagem final ao usuário
        System.out.println("\n***********************************************************\n");
        System.out.println("Olá, " +nomeCliente + "! Obrigado por criar uma conta em nosso banco!\nSua agência é "+agencia +"\nConta "+ conta +"\nSeu saldo de R$ "+ saldo+ " já está disponível para saque!");
        System.out.println("\n***********************************************************\n");

        // Fechanco o Scanner
        sc.close();
        
    }
}
