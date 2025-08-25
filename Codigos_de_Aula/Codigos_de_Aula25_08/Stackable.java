package Codigos_de_Aula.Codigos_de_Aula25_08;

public interface Stackable<T> {
    void push(T book);
    T pop();
    T peek();
}