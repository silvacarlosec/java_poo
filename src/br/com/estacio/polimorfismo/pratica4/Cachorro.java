package br.com.estacio.polimorfismo.pratica4;

public class Cachorro implements Animal {

    private final String nome;

    public Cachorro(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String emitirSom() {
        return "late";
    }
}
