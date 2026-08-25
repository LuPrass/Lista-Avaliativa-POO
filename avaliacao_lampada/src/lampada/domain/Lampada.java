package lampada.domain;

public class Lampada {

    private boolean acesa;
    private int watts;

    // Construtor com estado inicial e watts
    public Lampada(boolean acesa, int watts) {
        this.acesa = acesa;
        this.watts = watts;
    }

    // Construtor que recebe apenas a quantidade de watts
    public Lampada(int watts) {
        this.acesa = false;
        this.watts = watts;
    }

    // Construtor sem argumentos: atribui 60W por padrão
    public Lampada() {
        this.acesa = false;
        this.watts = 60;
    }

    // Método interruptor: inverte o estado e exibe na tela
    public void interruptor() {
        this.acesa = !this.acesa;
        System.out.println("O interruptor foi acionado.");
        exibirEstado();
    }

    // Método que exibe o estado atual da lâmpada
    public void exibirEstado() {
        if (this.acesa) {
            System.out.println("A lâmpada de " + this.watts + "W está ACESA.");
        } else {
            System.out.println("A lâmpada de " + this.watts + "W está APAGADA.");
        }
    }

    public boolean isAcesa() {
        return acesa;
    }

    public int getWatts() {
        return watts;
    }
}