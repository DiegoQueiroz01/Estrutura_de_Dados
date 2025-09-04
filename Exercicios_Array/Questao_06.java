package Exercicios_Array;

import java.util.Scanner;

public class Questao_06 {
    Scanner scan = new Scanner(System.in);
    int[] students = new int[10];
    float [] note = new float[4];
    String name;
    float mean;
    float sum = 0;

    public Questao_06(){
        for (int i = 0; i < note.length;  i++){
            System.out.println("Digite seu nome: " + (i + 1));
            System.out.println("Digite sua nota" + name + ": " + (i + 1));
            this.note[i] = scan.nextFloat();
            sum = sum + note[i];
        }
    }
}
