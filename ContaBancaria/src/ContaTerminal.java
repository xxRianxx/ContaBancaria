import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Olá seja bem vindo, Por favor digite seu nome:\n");
        String nomeCliente = input.nextLine();
        System.out.println("Por favor digite seu Numero da conta:\n");
        int numero = input.nextInt();
        System.out.println("Por favor digite sua Agencia:\n");
        String agencia = input.next();
        System.out.println("Por favor digite o valor que deseja depositar:\n");
        double saldo = input.nextDouble();

        System.out.printf("Óla %s, obrigado por criar uma conta em nosso banco, sua agência é %s e a conta é %d e seu saldo %.2f já está disponível para saque\n", nomeCliente, agencia, numero, saldo);
        System.out.println("Deseja retirar algum valor? se sim responda: sim, se não responda: nao\n");
        String resposta = input.next();
        double valorTirado = 0;
        if (resposta.equals("sim")) {
            System.out.println("digite o valor que deseja retirar:\n");
            valorTirado = input.nextDouble();
            if (valorTirado > saldo) {
                while (valorTirado > saldo) {
                    System.out.println("Saldo insuficiente:\n");
                    valorTirado = input.nextDouble();
                }

            }
            saldo -= valorTirado;
            System.out.printf("voce retirou: %.2f e agora seu saldo é %.2f", valorTirado, saldo);
        } else {
            System.out.println("Muito obrigado por escolher a gente até aproxima. caso não tenha terminado suas transações por favor reinicie o programa\n");

        }

    }

    }
