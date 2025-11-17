package br.com.estacio.polimorfismo.pratica4;

public class Gato implements Animal {
    private final String nome;

    public Gato(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String emitirSom() {
        return "mia";
    }
}
