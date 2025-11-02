package br.com.estacio.polimorfismo1;

public class Principal {

    public static void main(String[] args) {
        Derivada refDerivada = new Derivada();
        Base refBase = refDerivada;

        //refBase.atualizarValor(100);

        System.out.println(refBase);
        System.out.println(refDerivada);
    }
}
