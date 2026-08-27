package exercicios.estudantes.test;

import exercicios.estudantes.domain.Estudante;
import exercicios.estudantes.domain.Gerenciador;

public class TesteEstudante {
    public static void main(String[] args) {
        // 1. Criando estudantes e inserindo notas
        Estudante e1 = new Estudante("Lucas");
        e1.insereNotas(new double[]{8.0, 7.5, 9.0, 6.0, 7.0});

        Estudante e2 = new Estudante("Ana");
        e2.insereNotas(new double[]{4.0, 5.0, 3.5, 6.0, 5.0});

        Estudante e3 = new Estudante("Carlos");
        e3.insereNotas(new double[]{6.0, 6.5, 7.0, 6.0, 6.0});

        // 2. Testando média simples e ponderada (Ex. 2 e 4)
        System.out.println("--- Teste de Médias ---");
        System.out.printf("Média Simples de %s: %.2f\n", e1.getNome(), e1.calculaMedia());

        int[] pesos = {1, 2, 3, 2, 2};
        System.out.printf("Média Ponderada de %s: %.2f\n\n", e1.getNome(), e1.calculaMedia(pesos));

        // 3. Testando o filtro de aprovados (Ex. 3 - Gerenciador)
        System.out.println("--- Teste de Aprovados ---");
        Estudante[] turmas = {e1, e2, e3};
        Estudante[] aprovados = Gerenciador.filtrarAprovados(turmas);

        if (aprovados != null) {
            System.out.println("Estudantes Aprovados:");
            for (Estudante a : aprovados) {
                System.out.printf("- %s (Média: %.2f)\n", a.getNome(), a.calculaMedia());
            }
        } else {
            System.out.println("Nenhum estudante aprovado.");
        }
    }
}