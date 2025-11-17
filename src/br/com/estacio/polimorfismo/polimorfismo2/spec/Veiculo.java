package br.com.estacio.polimorfismo.polimorfismo2.spec;

public interface Veiculo {

    void acelerar();
    Motor getMotor();

    interface Motor {
        void ligar();
        void desligar();
    }
}
