package br.com.estacio.pratica1;

public class Main {

    public static void main(String[] args) {
        InstrumentoMusical instrumentoMusical1 = new Violao();
        InstrumentoMusical instrumentoMusical2 = new Flauta();

        instrumentoMusical1.tocar();
        instrumentoMusical2.tocar();
    }
}
