//7. Faça um programa em Java que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.

package Exercicios_Array;

import java.util.Scanner;

public class Questao_07 {
    int[] numeros = new int[5];
    int numero, soma = 0;
    int multiplicacao = 1;
    Scanner scan = new Scanner(System.in);

    public void calcular(){
        for(int i = 0; i <numeros.length; i++){
            System.out.println("Insira o número " + (i+1) + ": ");
            int numero = scan.nextInt();
            numeros[i] = numero;

            soma += numero;
            multiplicacao *= numero;
        }

        System.out.println("Números usados para o calculo: ");
        for(int i = 0; i < numeros.length; i++){
            System.out.println(numeros[i] + " ");
        }
    }

    public void imprimirCalculo(){
        System.out.println("A soma dos números é: " + soma);
        System.out.println("A múltiplicação dos números é: " + multiplicacao);
    }

    public static void main(String[] args){
        Questao_07 questao07 = new Questao_07();
        questao07.calcular();
        questao07.imprimirCalculo();
    }
}
