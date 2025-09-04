/**6. Faça um programa em Java que peça as quatro notas de 10 alunos, calcule e armazene num vetor a média de cada aluno, imprima o número de alunos com média
 maior ou igual a 7.0.*/
package Exercicios_Array;

import java.util.Scanner;

public class Questao_06 {
    Scanner scan = new Scanner(System.in);
    float [] means = new float[4];
    int countAgreements = 0;

    public Questao_06(){
        for(int j = 0; j < means.length; j++){
            float sum = 0;
            System.out.println("Digite seu nome " + (j + 1) + ":");
            String name = scan.nextLine();

            for (int i = 0; i < 4; i++){
            System.out.println("Digite a nota da unidade " + (i + 1) + ":");
            float note = scan.nextFloat();
            sum += note;
        }
        scan.nextLine();

        float mean = sum / 4;
        means[j] = mean;

        System.out.println("Média de " + name + ": " + mean);
        if(mean >= 7){
                System.out.println(name + " Aprovado :)");
                countAgreements++;
            } else{
                System.out.println(name + " Reprovado :(");
            }
    }
    }
    public void imprimirArray(){
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + countAgreements);
    }

    public static void main(String[] args){
        Questao_06 questao06 = new Questao_06();
        questao06.imprimirArray();
    }
}
