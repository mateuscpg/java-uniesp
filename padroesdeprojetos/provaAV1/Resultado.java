package com.uniesp.aula1.padroesdeprojetos.provaAV1;

import java.util.ArrayList;
public class Resultado {
    private String nomeEspecie ;
    private int quantidade ;

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    private String nomeAnimal;

    public Resultado() {
    }
    public Resultado (String nomeEspecie , int quantidade, String nomeAnimal) {
        this.nomeEspecie = nomeEspecie ;
        this.quantidade = quantidade ;
        this.nomeAnimal = nomeAnimal;
    }
    public String getNomeEspecie () {
        return nomeEspecie ;
    }
    public int getQuantidade () {
        return quantidade ;
    }
    public String getnomeAnimal(){
        return nomeAnimal;
    }
    public Resultado metodo(String nomeAnimal,ArrayList<Animal> completo, String nomeEspecie)
    {
        Ferramentas2 f = new Ferramentas2();
        completo=f.filtraEspecie(completo, nomeEspecie);
        this.nomeAnimal= nomeAnimal;
        this.nomeEspecie=nomeEspecie;
        this.quantidade=completo.size();


        return (this);
    }
    @Override
    public String toString() {
        return "Nome do animal="+nomeAnimal+ "\nNome da especie = "+this.getNomeEspecie() + "\nQuantidade= " + getQuantidade() +"";
    }


}
