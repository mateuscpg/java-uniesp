package com.uniesp.aula1.padroesdeprojetos.provaAV1;

public class Cachorro implements Animal{
    private String nomeAnimal;
    private String nomeEspecie;

    public Cachorro(String nomeAnimal, String nomeEspecie) {
        this.nomeAnimal = nomeAnimal;
        this.nomeEspecie = nomeEspecie;
    }

    @Override
    public String getNomeEspecie() {
        // TODO Auto-generated method stub
        return this.nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {

        return this.getNomeAnimal();
    }
}
