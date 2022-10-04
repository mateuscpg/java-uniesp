package com.uniesp.aula1.padroesdeprojetos.provaAV1;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<Animal> vetoranimais = new ArrayList();
        Cachorro animal01= new Cachorro("Lara", "Mamifero");
        Sapo animal02= new Sapo("Jucicleia", "Anfibio");
        Passaro animal03= new Passaro("Lucas", "Ave");
        vetoranimais.add(animal01);
        vetoranimais.add(animal02);
        vetoranimais.add(animal03);
        Resultado x  = new Resultado();
        x.metodo("Lara",vetoranimais,  "Ave");
        System.out.println(x.toString());
        x.metodo("Lucas",vetoranimais,  "Mamifero");
        System.out.println(x.toString());
        x.metodo("Pedro",vetoranimais,  "Anfibio");
        System.out.println(x.toString());

    }
}
