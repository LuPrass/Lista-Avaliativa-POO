package exercicios.biblioteca.domain;
public class Livro extends ItemAcervo {
    private boolean disponivel;

    public Livro(String titulo) {
        super(titulo);
        this.disponivel = true;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void emprestar() {
        if (disponivel) {
            disponivel = false;
        }
    }

    public void devolver() {
        disponivel = true;
    }
}