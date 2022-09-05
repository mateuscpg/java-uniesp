package com.uniesp.aula1.backend.aulas;

import java.util.Scanner;

public class CadastroAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe seu nome:  ");
        String nome = sc.next();
        System.out.println("Qual a sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Informe seu endereço: ");
        String endereco = sc.next();
        System.out.println("Informe qual curso você faz: ");
        String curso = sc.next();

        if (idade < 18){
        System.out.println("Por favor, se dirigir a secretaria e preencher declaração com a assinatura do responsável.");
        }else{
            System.out.println("Estudante "+nome+ "cadastrado com sucesso no curso: "+curso);
        }
    }

}
