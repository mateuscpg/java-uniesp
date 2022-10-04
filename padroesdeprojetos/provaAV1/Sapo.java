package com.uniesp.aula1.padroesdeprojetos.provaAV1;

public class Sapo implements Animal{
    private String nomeAnimal;
    private String nomeEspecie;

    public Sapo(String nomeAnimal, String nomeEspecie) {

        this.nomeAnimal = nomeAnimal;
        this.nomeEspecie = nomeEspecie;
    }

    @Override
    public String getNomeEspecie() {

        return this.nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {

        return this.getNomeAnimal();
    }
}
