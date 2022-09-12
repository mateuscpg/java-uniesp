package com.uniesp.aula1.padroesdeprojetos.aula2;

public class ContaApp {
    public static void main(String[] args) {
        Conta c = new Conta();
        Conta conta2 = new Conta(2, "Monitor", 10000, 1000);
//      Conta conta3 = new Conta(3, "Monitor", 10000);

        ContaRemunerada contarRem = new ContaRemunerada();
        c.limite = 1000;
        c.nome = "Mateus";
        c.saldo = 10000;
        c.numero = 1;

        System.out.println("Saldo inicial: "+c.saldo);
        System.out.println("Saldo inicial conta2: "+conta2.saldo);
        c.sacar(200);

        System.out.println("Saldo após saque: "+c.saldo);
        System.out.println("Saldo após saque conta2: "+conta2.saldo);

        double novoSaldo = c.sacar(200,100000);
        double novoSaldo2 = conta2.sacar(200,100000);

        System.out.println("Saldo após saque do sonho: "+novoSaldo);
        System.out.println("Saldo após saque do sonho Conta2: "+novoSaldo);

    }

}
