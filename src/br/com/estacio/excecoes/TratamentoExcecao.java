package br.com.estacio.excecoes;

public class TratamentoExcecao {

    public static int divisao(int dividendo, int divisor) {
        return dividendo / divisor;
    }

    static void main() {
        try {
            int resultado = divisao(-1, 0);
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero");
        }
    }
}
