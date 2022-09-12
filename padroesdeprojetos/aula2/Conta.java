package com.uniesp.aula1.padroesdeprojetos.aula2;

public class  Conta {
    int numero;
    String nome;
    double saldo;
    double limite;
    Conta contaDependente;

    void sacar (double qtd){
        double novoSaldo = this.saldo - qtd;
        this.saldo = novoSaldo;
    }
    double sacar (double qtd, double saldo){
        double novoSaldo = saldo - qtd;
        return novoSaldo;
    }
    public  Conta(){
        Conta conta3 = new Conta(3, "Conta Master", 10000);
    }
    public Conta(int numero,String nome, double saldo, double limite){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;

    }
    private Conta(int numero,String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
        this.limite = limite;
        int numeroContaDep = numero +1;
        this.contaDependente = new Conta();
    }


}
