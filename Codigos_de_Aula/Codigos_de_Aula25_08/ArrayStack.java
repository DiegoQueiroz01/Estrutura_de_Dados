package Codigos_de_Aula.Codigos_de_Aula25_08;

public class ArrayStack<T> implements Stackable<T> { //classe genérica: pode armazenar qualquer tipo de onjeto.
    private T[] stack; //array que guarda os elementos da pilha
    private int topPointer; //indica o topo da pilha

    public ArrayStack() { //construtor padrão
        this(10); //tamanho da pilha = 10
    }

    @SuppressWarnings("unchecked")
    public ArrayStack(int tamanho) { //construtor em que o usuário define o tamanho da pilha
        stack = (T[]) new Object[tamanho]; //objeto genérico
        topPointer = -1; //indica a pilha vazia
    }
    
    //insere um item no topo, caso esteja vazia imprime a mensagem, e caso não esteja, insere um item no topo da pilha
    @Override
    public void push(T book) { 
        if (isFull()) {
            System.out.println("Pilha cheia!");
            return;
        }
        topPointer++; 
        stack[topPointer] = book;
    }

    //se a pilha está vazia imprime a mensagem, do contrário remo o item do topo, e guarda em temp, topPointer retorna o item removido
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        T temp = stack[topPointer];
        topPointer--;
        return temp;

    }

    @Override
    public T peek() {
        if (isEmpty()) {
         System.out.println("Pilha vazia!");
            return null;
        }
        return stack[topPointer];
    }
    
    //verifica se a pilha está vazia
    private boolean isEmpty() { 
        return topPointer == -1; 
    }

    //verifica se a pilha está cheia
    private boolean isFull() {
        return topPointer == stack.length - 1;
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = topPointer; i >= 0; i--) {
            result += stack[i];
            if (i != 0)
                result += ",\n";
        }
        return "[\n" + result + "\n]";
    }
}