package lampada.test;

import lampada.domain.Lampada;

public class Main {
    public static void main(String[] args) {
        // Criando uma lâmpada informando estado inicial e watts
        Lampada lampada1 = new Lampada(true, 100);
        lampada1.exibirEstado();

        // Alternando o estado usando o interruptor
        lampada1.interruptor();

        System.out.println("---");

        // Criando uma lâmpada com o construtor padrão (60W)
        Lampada lampada2 = new Lampada();
        lampada2.exibirEstado();
        lampada2.interruptor();
    }
}