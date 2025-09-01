//1. Faça um programa em Java que leia um vetor de 5 números inteiros e mostre-os.
package Exercicios_Array;

public class Questao_01 {
    int[] numeros = new int[5];

    public Questao_01(){

    numeros[0] = 1;
    numeros[1] = 2;
    numeros[2] = 3;
    numeros[3] = 4;
    numeros[4] = 5;
    }

    public void imprimirArray(){
        for (int i = 0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }
    }

    public static void main(String[] args) {
        Questao_01 questao01 = new Questao_01();
        questao01.imprimirArray();
    }
}
