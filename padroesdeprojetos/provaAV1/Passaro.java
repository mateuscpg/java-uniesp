package com.uniesp.aula1.padroesdeprojetos.provaAV1;

public class Passaro implements Animal{
    public Passaro(String nomeAnimal, String nomeEspecie) {
        this.nomeAnimal = nomeAnimal;
        this.nomeEspecie = nomeEspecie;
    }

    private String nomeAnimal;
    private String nomeEspecie;
    @Override
    public String getNomeEspecie() {

        return this.nomeEspecie;
    }

    @Override
    public String getNomeAnimal() {

        return this.nomeAnimal();
    }

    private String nomeAnimal() {
        return nomeAnimal;
    }

}
