package br.com.estacio.excecoes.pratica2;

import java.util.Scanner;

public class ExemploExcecao {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            boolean senhaValida = false;

            do {
                System.out.println("Digite a senha: ");
                String senha = sc.nextLine();

                try {
                    validarSenha(senha);
                    senhaValida = true;
                } catch (SenhaInvalidaExcecao e) {
                    System.out.println("Senha inválida: " + e.getMessage());
                }
            } while (!senhaValida);
        }
    }

    private static void validarSenha(String senha) throws SenhaInvalidaExcecao {
        if (senha.length() < 5) {
            throw new SenhaInvalidaExcecao("A senha deve ter, pelo menos, 5 caracteres");
        }

        if (!senha.matches(".*\\d.*")) {
            throw new SenhaInvalidaExcecao("A senha deve conter, no mínimo, um dígito");
        }
    }
}
