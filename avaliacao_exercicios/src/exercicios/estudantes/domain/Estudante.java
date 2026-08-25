package exercicios.estudantes.domain;
public class Estudante {
        private String nome;
        private double[] notas;


        public Estudante(String nome) {
            this.nome = nome;
            this.notas = new double[5]; // dimensiona o array em 5 posições
        }
        public void insereNotas(double[] novasNotas) {
            for (int i = 0; i < 5 && i < novasNotas.length; i++) {
                this.notas[i] = novasNotas[i];
            }
        }

        public double calculaMedia() {
            double soma = 0;
            for (double nota : this.notas) {
                soma += nota;
            }
            return soma / 5;
        }
        public double calculaMedia(int[] pesos) {
            double somaPonderada = 0;
            int somaPesos = 0;

            for (int i = 0; i < 5; i++) {
                somaPonderada += this.notas[i] * pesos[i];
                somaPesos += pesos[i];
            }

            return somaPonderada / somaPesos;
        }
    }
