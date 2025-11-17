package br.com.estacio.polimorfismo.polimorfismo2.impl;

import br.com.estacio.polimorfismo.polimorfismo2.spec.Veiculo;

public class Carro implements Veiculo {

    private final Motor motor;

    public Carro() {
        this.motor = new MotorCarro();
    }

    @Override
    public Motor getMotor() {
        return this.motor;
    }

    @Override
    public void acelerar() {
        System.out.println("Carro acelerando.");
    }

    private static class MotorCarro implements Motor {

        @Override
        public void ligar() {
            System.out.println("Motor do carro ligado.");
        }

        @Override
        public void desligar() {
            System.out.println("Motor do carro desligado.");
        }
    }
}
