package exercicios.biblioteca.domain;
public class Periodico extends ItemAcervo {
        private int volume;

        public Periodico(String titulo, int volume) {
            super(titulo);
            this.volume = volume;
        }

        public int getVolume() {
            return volume;
        }
    }