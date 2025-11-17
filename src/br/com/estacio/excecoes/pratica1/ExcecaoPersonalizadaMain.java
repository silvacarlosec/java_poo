package br.com.estacio.excecoes.pratica1;

public class ExcecaoPersonalizadaMain {

    public static void main(String[] args) {
        try {
            int resultado = divisao(20, 0);
            System.out.println("Resultado=" + resultado);
        } catch (ExcecaoPersonalizadaDivisaoPorZero e) {
            //System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static int divisao(int dividendo, int divisor) throws ExcecaoPersonalizadaDivisaoPorZero {
        if (divisor == 0) {
            throw new ExcecaoPersonalizadaDivisaoPorZero("O divisor não pode ser zero");
        }

        return dividendo / divisor;
    }

}
