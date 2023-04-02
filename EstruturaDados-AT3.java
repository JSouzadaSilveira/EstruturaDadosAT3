import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class OrdenacaoDeDados {

    public static void main(String[] args) {
        // Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células
        ArrayList<Integer> lista = new ArrayList<>(5);
        for (int i = 1; i <= 5; i++) {
            lista.add(i);
        }

        // Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células
        Stack<Integer> pilha = new Stack<>();
        while (!lista.isEmpty()) {
            // Remove o primeiro elemento da lista e insere na pilha
            int numero = lista.remove(0);
            pilha.push(numero);
        }

        // Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células
        Queue<Integer> fila = new LinkedList<>();
        while (!pilha.isEmpty()) {
            // Remove o último elemento da pilha e insere na fila
            int numero = pilha.pop();
            fila.add(numero);
        }

        // Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista
        for (int i = 6; i <= 10; i++) {
            lista.add(i);
        }

        // Passo 5: Repita os passos 2 e 3
        while (!lista.isEmpty()) {
            // Remove o primeiro elemento da lista e insere na pilha
            int numero = lista.remove(0);
            pilha.push(numero);
        }

        while (!pilha.isEmpty()) {
            // Remove o último elemento da pilha e insere na fila
            int numero = pilha.pop();
            fila.add(numero);
        }

        // Passo 6: Exiba todos os números que foram inseridos na fila
        System.out.println("Números inseridos na fila:");
        while (!fila.isEmpty()) {
            // Remove o primeiro elemento da fila e exibe na tela
            int numero = fila.remove();
            System.out.print(numero + " ");
        }
    }
}


/*
A ordem dos números exibidos na fila será diferente da ordem em que foram inseridos na lista porque, no passo 2, os dados são retirados da lista de forma ordenada do início para o fim e inseridos na pilha de forma invertida, do fim para o início. No passo 3, os dados são retirados da pilha na ordem inversa e inseridos na fila, resultando em uma ordem diferente da original.

No passo 5, o programa repete o processo do passo 2 e 3, mas agora com os números de 6 a 10, que serão inseridos na lista depois dos números de 1 a 5. Como a inserção na fila é feita sempre no final, sem levar em conta a ordem original da lista, a ordem dos números exibidos na fila será 1 2 3 4 5 10 9 8 7 6, ou seja, diferente da ordem original da lista.

*/