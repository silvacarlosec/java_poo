package br.com.estacio.polimorfismo.pratica3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Main {

    public static void main(String[] args) {

        List<Acao> acoes = new ArrayList<>();

        acoes.add(new AcaoImpressao("Olá, Mundo!"));
        acoes.add(new AcaoImpressao("Isso é um exemplo de programação funcional."));

        Consumer<Acao> executor = x -> x.executar();
        acoes.forEach(executor);

    }
}
