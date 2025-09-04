//03. Faça um programa em Java que leia 4 notas, mostre as notas e a média na tela.
package Exercicios_Array;

import java.util.Scanner;

public class Questao_03 {
    float [] nota = new float[4];
    Scanner scanner = new Scanner(System.in);    
    float media, soma = 0;

    public Questao_03(){
        for (int i = 0; i < nota.length; i++){
            System.out.println("Digite sua nota: " + (i + 1));
            float nota = scanner.nextFloat();
            this.nota[i] = nota;
            soma = soma + nota;
        }
    }
    public void imprimirArray(){
        for (int i = 0; i <nota.length; i++){
            System.out.println("Nota: " + nota[i]);
        }
    float media = soma / 4;
        System.out.println("Média: " + media);
        if(media >= 7){
            System.out.println("Aprovado :)");
        }
        else{
            System.out.println("Reprovado :(");
        }
    }

    public static void main(String[] args){
        Questao_03 questao03 = new Questao_03();
        questao03.imprimirArray();

    }
}
