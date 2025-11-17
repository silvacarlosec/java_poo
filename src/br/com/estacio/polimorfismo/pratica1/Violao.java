package br.com.estacio.polimorfismo.pratica1;

public class Violao implements InstrumentoMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando o violão.");
    }
}
