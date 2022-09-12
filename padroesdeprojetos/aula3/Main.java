package com.uniesp.aula1.padroesdeprojetos.aula3;

public class Main {
    public static void main(String[] args) {


        Pessoa funcionario = new Pessoa(0027,"Mateus", "08 de maio de 2001", "Vou dizer nada","(83) 0000-0000", "Dev", 5000, "06/06/2022");
        System.out.println("Nome do funcionário: " + funcionario.nome + "\nMatrícula do funcionário: " + funcionario.matricula + "" + "\nData de Nascimento do funcionário: " + funcionario.dataNascimento + "\nEndereço do funcionário: " + funcionario.endereco + "\nContato do funcionário: " + funcionario.contato + "\nCargo do funcionário: " + funcionario.cargo + "\nSalário do funcionário: " + funcionario.salario + "\nData de Admissão do funcionário: " + funcionario.dataAdmissao);

        funcionario.promoverCargo("cargo");
        funcionario.reajustarSalario();
        System.out.println("O novo cargo do funcionário é: "+funcionario.cargo);
        System.out.println("O novo salario do funcionario é: "+funcionario.salario);



        Pessoa cliente = new Pessoa(2707,"alexia", "12.04.1981", "Altiplano", "(54) 9 8727-3415", "Diretora", "analista de sistemas");
        System.out.println("Codigo do cliente: " +cliente.codigo+"\nNome do cliente: "+cliente.nome+"\nData de Nascimento do cliente: "+ cliente.dataNascimento + "\nEndereço do cliente: "+ cliente.endereco +"\nContato do cliente: "+ cliente.contato +"\nCargo do cliente: "+ cliente.cargo +"\nProfissão do cliente: " +cliente.profissao);




    }
}
