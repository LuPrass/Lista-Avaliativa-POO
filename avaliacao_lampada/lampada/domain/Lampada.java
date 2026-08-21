package aulaifcurso.avaliacao.lampada.domain;
/**
 * Classe que representa uma lâmpada com estado (ligada/desligada) e potência em watts.
 */
public class Lampada {

    // ── VARIÁVEIS DE INSTÂNCIA ──────────────────────────────────────────────
    // Armazenam o estado interno de cada objeto Lampada criado.

    private boolean ligada; // Indica se a lâmpada está ligada (true) ou desligada (false)
    private int watts;  // Armazena a potência da lâmpada em watts

    // CONSTRUTORES
    public Lampada() {
        this.watts = 60;
        this.ligada = false;
    }

    public Lampada(boolean ligada, int watts) {
        this.watts = watts;
        this.ligada = ligada;
    }

    // ── MÉTODOS ─────────────────────────────────────────────────────────────
    /**
     * Simula o acionamento do interruptor da lâmpada.
     * Altera o estado da variável "ligada" conforme o valor passado como argumento.
     * Passar true liga a lâmpada; passar false a desliga.
     *
     * @param ligada novo estado desejado para a lâmpada
     */
    public void interruptor(boolean ligada){
        this.ligada = ligada;
    }

    /**
     * Exibe no console o estado atual da lâmpada e sua potência.
     * Utiliza um operador ternário para converter o booleano "ligada"
     * em texto legível ("Ligada" ou "Desligada") antes de imprimir.
     */
    public void mostrarEstadoLampada(){
        String estadoLampada = (ligada) ? "Ligada":"Desligada";
        System.out.println("A lâmpada está: "+estadoLampada);
        System.out.println("Potencia da lâmpada: "+watts);
    }
}
