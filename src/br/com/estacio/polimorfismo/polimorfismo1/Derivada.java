package br.com.estacio.polimorfismo.polimorfismo1;

public class Derivada extends Base {

    protected int valor;

    public Derivada() {
        super.valor = this.valor = -2;
    }

    @Override
    public void atualizarValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Derivada{" +
                "valor=" + valor +
                '}';
    }
}
