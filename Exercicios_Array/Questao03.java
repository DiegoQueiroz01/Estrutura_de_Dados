//03. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela.
package Exercicios_Array;

import java.util.Scanner;

public class Questao03 {
    float [] nota = new float[4];
    Scanner scanner = new Scanner(System.in);

    public void Questao03(){
        for (int i =0; i<nota.length; i++){
            System.out.println("Digite a nota: " + (i=1));
            nota[i] = scanner.nextFloat();
        }
    }
    float soma;

    public void imprimirArray(){
        soma = 0;
        for (int i = 0; i<nota.length; i++){
            System.out.println("Nota: " + nota[i]);
            soma = soma + nota[i];
        }
    float media = soma / nota.length;
        System.out.println("Média: " + media);
    }

    public static void main(String [] args){
        Questao03 questao03 = new Questao03();
        questao03.imprimirArray();

    }
}
