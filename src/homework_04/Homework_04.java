package homework_04;

import java.text.DecimalFormat;

public class Homework_04 {

    public static void main(String[] args) {

        //Declarando e inicializando Array
        String[][] alunoNotas = {
            {"Junior", "7", "7.5", "8.5", "10"},
            {"Alex", "6", "5.5", "8.5", "5"},
            {"Amber", "9.2", "10", "8.5", "10"},
            {"Tiago", "4", "5.5", "5", "4.2"},
            {"Felipe", "6.2", "7.3", "6.8", "4.2"},
            {"Ana", "9.5", "10", "10", "10"},
            {"Jéssica", "6.5", "4", "5.5", "1"}               
        };


        /*------------------------------------------------------------*/
        //Convertendo os valores em String para double e armazenando no Array notas.
        System.out.println(" ");
        
        byte nomeDoAluno = 1;

        double[][] notas = new double[alunoNotas.length][alunoNotas[0].length];

        for (int linha = 0; linha < notas.length; linha++) {
            for (int coluna = 0; coluna < notas[0].length - nomeDoAluno; coluna++) {
                notas[linha][coluna] = Double.parseDouble(alunoNotas[linha][coluna + 1]);
            }
        }


        /*------------------------------------------------------------*/        
        
        //Calculando e exibindo a média de cada Aluno
        
        DecimalFormat arredondarMedia = new DecimalFormat("##.#");
        for (int linha = 0; linha < notas.length; linha++) {

            double nota1 = notas[linha][0];
            double nota2 = notas[linha][1];
            double nota3 = notas[linha][2];
            double nota4 = notas[linha][3];
            double media = (nota1 + nota2 + nota3 + nota4) / 4;

            String estado = "";
            if (media < 5) {
                estado = "Reprovado";
            } else if (media >= 5 && media <= 7) {
                estado = "Recuperação";
            } else if (media > 7) {
                estado = "Aprovado";
            }

            if (linha == linha) {
                System.out.println(alunoNotas[linha][0] + "\t --> \t|" + nota1 + " \t|" + nota2 + " \t|" + nota3 + " \t|"
                        + nota4 + " \t| Média: " + arredondarMedia.format(media) + " \t|" + estado);
            }

        }

    }

}
