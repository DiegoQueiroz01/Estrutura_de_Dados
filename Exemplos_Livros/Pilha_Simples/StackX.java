package Exemplos_Livros.Pilha_Simples;


public class StackX {
    private int maxSize; //define o tamnho da pilha
    private long[] stackArray;
    private int top; //define o top da pilha

    public StackX(int s){ //netódos construtor
        int maxSize = s; //define o tamanho da pilha
        stackArray = new long[maxSize]; //cria a pilha
        top = -1; //indica que a pilha está vazia
    }

    public void push(long j){ //empilhha um item no topo da pilha
        stackArray[++top] = j; //incrementa o top e insere o item
    }

    public long pop(){ //desempiha um item do topo
        return stackArray[top--]; //insere o item e decrementa o top
    }

    public long peek(){ //mostra o item do topo
        return stackArray[top]; //retorna o topo
    }

    public boolean isEmpty(){ //mostra se a pilha está vazia
        return (top == -1);
    }   

    public boolean isFull(){ //mostra se a pilha está cheia
        return (top == maxSize - 1);
    }
}
