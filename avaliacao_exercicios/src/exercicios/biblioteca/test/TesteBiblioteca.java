package exercicios.biblioteca.test;

import exercicios.biblioteca.domain.Livro;
import exercicios.biblioteca.domain.Periodico;

public class TesteBiblioteca {
    public static void main(String[] args) {
        // 1. Instanciando itens do acervo (Ex. 5)
        Livro livro = new Livro("Entendendo Algoritmos");
        Periodico periodico = new Periodico("Revista Java Magazine", 42);

        System.out.println("--- Dados do Acervo ---");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Periódico: " + periodico.getTitulo() + " - Volume: " + periodico.getVolume());

        // 2. Testando fluxo de empréstimo do Livro
        System.out.println("\n--- Fluxo de Empréstimo do Livro ---");
        System.out.println("Livro está disponível? " + livro.isDisponivel());

        System.out.println("Realizando empréstimo...");
        livro.emprestar();
        System.out.println("Livro está disponível? " + livro.isDisponivel());

        System.out.println("Realizando devolução...");
        livro.devolver();
        System.out.println("Livro está disponível? " + livro.isDisponivel());
    }
}