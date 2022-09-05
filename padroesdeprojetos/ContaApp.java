package com.uniesp.aula1.padroesdeprojetos;

public class ContaApp {
    public static void main(String[] args) {
        Conta c = new Conta();
        c.limite = 1000;
        c.nome = "Mateus";
        c.saldo = 10000;
        c.numero = 1;

        System.out.println("Saldo inicial: "+c.saldo);
        c.sacar(200);
        System.out.println("Saldo após saque: "+c.saldo);

        double novoSaldo = c.sacar(200,100000);

        System.out.println("Saldo após saque do sonho: "+novoSaldo);
    }

}
