package br.com.estacio.excecoes.pratica5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ExemploTratamentoExcecao {

    static void main() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("entrada.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro durante o fechamento do arquivo: " + e.getMessage());
            }
        }
    }

}
