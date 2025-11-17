package br.com.estacio.polimorfismo.polimorfismo3.impl;

import br.com.estacio.polimorfismo.polimorfismo3.spec.IContrato1;

public class Classe1 implements IContrato1.IIntracontrato1 {

    @Override
    public void intraMetodo1() {
        System.out.println("intraMetodo1");
    }
}
