package exercicios.biblioteca   .domain;

public class Gerenciador {

    public static Estudante[] filtrarAprovados(Estudante[] estudantes) {
        int contAprovados = 0;

        for (Estudante e : estudantes) {
            if (e != null && e.calculaMedia() >= 6.0) {
                contAprovados++;
            }
        }

        if (contAprovados == 0) {
            return null; // Exigência do enunciado caso nenhum seja aprovado
        }

        Estudante[] aprovados = new Estudante[contAprovados];
        int index = 0;

        for (Estudante e : estudantes) {
            if (e != null && e.calculaMedia() >= 6.0) {
                aprovados[index++] = e;
            }
        }

        return aprovados;
    }
}