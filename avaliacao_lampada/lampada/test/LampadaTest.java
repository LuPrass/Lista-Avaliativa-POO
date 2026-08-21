package aulaifcurso.avaliacao.lampada.test;

import aulaifcurso.avaliacao.lampada.domain.Lampada;

/**
 * Classe de teste responsável por demonstrar o funcionamento da classe Lampada.
 * Contém o método main, que é o ponto de entrada da aplicação Java.
 */
public class LampadaTest {
    public static void main(String[] args) {

        // Cria um objeto Lampada usando o construtor parametrizado:
        // a lâmpada já nasce ligada (true) e com potência de 75W
        Lampada lampada1 = new Lampada(true,75);

        // Aciona o interruptor passando false, desligando a lâmpada
        lampada1.interruptor(false);

        // Exibe no console o estado atual da lâmpada (deverá mostrar "Desligada" e "75W")
        lampada1.mostrarEstadoLampada();
    }
}
