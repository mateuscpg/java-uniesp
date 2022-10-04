package com.uniesp.aula1.padroesdeprojetos.atividadeMercado;

import com.fasterxml.jackson.databind.DatabindException;
import com.uniesp.aula1.padroesdeprojetos.aula4.Direction;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Produtos implements DiaEHorario{

    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public int diaDaSemana(int dia) {
        return dia;
    }

    @Override
    public int hora(int hora) {
        return hora;
    }

    @Override
    public int min(int min) {
        return min;
    }

    @Override
    public int seg(int seg) {
        return seg;
    }

    public double promocaoParaVoce(int dia, double preco, int hora){
        if (dia == 1 || dia == 7){
            return preco * 0.9;
        } else if (hora >= 20){
            return preco * 0.9;
        } else{
            return preco;
        }
    }

}
