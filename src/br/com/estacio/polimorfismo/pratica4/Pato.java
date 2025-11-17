package br.com.estacio.polimorfismo.pratica4;

public class Pato implements Animal{
    private final String nome;

    public Pato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String emitirSom() {
        return "grasna";
    }
}
