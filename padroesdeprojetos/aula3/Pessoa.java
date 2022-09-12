package com.uniesp.aula1.padroesdeprojetos.aula3;

import java.util.Scanner;
public class Pessoa {
    int matricula;
    int codigo;
    String nome;
    String dataNascimento;
    String endereco;
    String contato;
    String cargo;
    String profissao;
    double salario;
    String dataAdmissao;
    public void promoverCargo(String cargo) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o seu novo cargo, patrão: ");
        String promocao = ler.nextLine();
        this.cargo = promocao;
    }
    public void reajustarSalario() {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite a bufunfa que você vai receber: ");
        double salario = ler.nextDouble();
        this.salario = salario;
    }

    public Pessoa(int matricula, String nome, String dataNascimento, String endereco, String contato, String cargo, double salario, String dataAdmissao){
        this.matricula = matricula;
        this.codigo = codigo;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.cargo = cargo;
        this.profissao = profissao;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }
    public Pessoa(int codigo, String nome, String dataNascimento, String endereco, String contato, String cargo, String profissao) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.contato = contato;
        this.cargo = cargo;

    }
}

