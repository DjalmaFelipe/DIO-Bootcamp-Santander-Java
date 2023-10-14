/*  author: Djalma Felipe
    date: 14-10-2023
    
    código implementado sem padrão de projeto e orientação a objetos
    para seguir cronologia didática do bootcamp santander
*/

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente;
        String agencia;
        int numero;
        double saldo;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Por favor, digite o seu nome: ");
        nomeCliente = entrada.nextLine();
        System.out.print("Por favor, digite o número da Agência: ");
        agencia = entrada.nextLine();
        System.out.print("Por favor, digite o número da conta: ");
        numero = Integer.parseInt(entrada.nextLine());
        System.out.print("Por favor, digite o valor do saldo: ");
        saldo = Double.parseDouble(entrada.nextLine());

        entrada.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de " + String.format("%.2f", saldo) + " R$ já está disponível para saque.");
    }
}
