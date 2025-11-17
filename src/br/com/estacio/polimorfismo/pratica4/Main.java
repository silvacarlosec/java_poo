package br.com.estacio.polimorfismo.pratica4;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void main() {
        List<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Boby"));
        animais.add(new Gato("Bechara"));
        animais.add(new Pato("Patolino"));

        System.out.println("Animais com nomes curtos");
        animais.stream()
                .filter(a -> a.getNome().length() < 6)
                .forEach(a -> System.out.println(a.getNome() + " " + a.emitirSom()));

        System.out.println("Animais com nomes longos");
        animais.stream()
                .filter(a -> a.getNome().length() > 7)
                .forEach(a -> System.out.println(a.getNome() + " " + a.emitirSom()));
    }
}
