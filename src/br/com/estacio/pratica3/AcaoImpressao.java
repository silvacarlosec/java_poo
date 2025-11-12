package br.com.estacio.pratica3;

public class AcaoImpressao implements Acao {

    private final String mensagem;

    public AcaoImpressao(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public void executar() {
        System.out.println(mensagem);
    }
}
