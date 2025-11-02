package br.com.estacio.polimorfismo1;

public class Base {

    protected int valor;

    public Base() {
        valor = -1;
    }

    protected void atualizarValor(int valor) {
        ((Derivada) this).valor = valor; // Downcasting
    }

    @Override
    public String toString() {
        return "Base{" +
                "valor=" + valor +
                '}';
    }
}
