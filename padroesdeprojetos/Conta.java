package com.uniesp.aula1.padroesdeprojetos;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    void sacar (double qtd){
        double novoSaldo = this.saldo - qtd;
        this.saldo = novoSaldo;
    }
    double sacar (double qtd, double saldo){
        double novoSaldo = saldo - qtd;
        return novoSaldo;
    }


}
