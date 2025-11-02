package br.com.estacio.pratica1;

public class Violao implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando o violão.");
    }
}
