package br.com.estacio.excecoes.pratica4;

import java.io.IOException;

public class EncadeamentoExcecao {

    static void main(String[] args) {
        try {
            abrirArquivo();
        } catch(AbrirArquivoExcecao e) {
            e.printStackTrace();
        }
    }

    private static void abrirArquivo() throws AbrirArquivoExcecao {
        try {
            // Simulando exceção
            throw new IOException("Incapaz de abrir o arquivo");
        } catch (IOException e) {
            throw new AbrirArquivoExcecao("Ocorreu um erro ao abrir o arquivo", e);
        }
    }
}

class AbrirArquivoExcecao extends Exception {

    public AbrirArquivoExcecao(String message, Throwable cause) {
        super(message, cause);
    }
}
