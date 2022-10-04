package com.uniesp.aula1.padroesdeprojetos.atividadeMercado;

import java.util.Scanner;

public class ProdutoApp {


    public static void main(String[] args) {

        Produtos produto = new Produtos();
        Scanner sc = new Scanner(System.in);

        boolean j = true;
        while (j) {
            System.out.print("1 - Calcular Preço de Produto");
            System.out.print("2 - Sair");
            System.out.print("");
            int resp = sc.nextInt();
            if(resp == 1) {
                System.out.print("Nome do produto: ");
                produto.setNome(sc.nextLine());
                System.out.print("Preço do produto: ");
                produto.setPreco(sc.nextDouble());
                boolean i = true;
                while (i) {
                    System.out.print("Dia da semana");
                    System.out.print("1 - Domingo");
                    System.out.print("2 - Segunda");
                    System.out.print("3 - Terça");
                    System.out.print("4 - Quarta");
                    System.out.print("5 - Quinta");
                    System.out.print("6 - Sexta");
                    System.out.print("7 - Sábado");
                    System.out.print("0 - Sair");
                    System.out.print("");
                    int respDia = sc.nextInt();
                    if(respDia == 0){
                        i = false;
                    } else if(respDia >= 1 && respDia <= 7) {
                        //diaDaSemana(respDia);
                    } else{
                        System.out.println("Opção inválida! Tente novamente.");
                    }
                }

                System.out.println("Informe a hora (HH):");

                System.out.print("Horário (HH:MM:SS): ");

                System.out.println("O valor final do produto é R$");
            } else if(resp == 2){
                System.out.println("Saindo...");
                j = false;
            } else{
                System.out.println("Resposta inválida! Tente novamente.");
            }
        }

    }
}
