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