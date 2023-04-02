# EstruturaDadosAT3
Atividade escrita 


## Solicitação:
Implemente um projeto no qual serão inseridos números de forma ordenada, e que atenda as especificações a seguir: 
 
Passo 1: Insira os números [1, 2, 3, 4 e 5] em uma lista - com 5 células; 
Passo 2: Remova todos os dados da lista e insira-os em uma Pilha - com 5 células. Deve-se sempre remover os dados da célula inicial da lista; 
Passo 3: Remova os dados da Pilha e insira-os em uma Fila - com 10 células); 
Passo 4: Insira os números [6, 7, 8, 9 e 10] na lista; 
Passo 5: Repita os passos 2 e 3. 
Passo 6: Exiba todos os números que foram inseridos na fila. 

Analise a ordem dos números exibidos e verifique se estão na mesma forma que foram inseridos. Se a exibição foi diferente, justifique o ocorrido. 
O programa desenvolvido pelo aluno e a sua justificativa deverá ser postado em um ambiente virtual. Esse programa será avaliado pelo tutor responsável pela disciplina.



## Explicação:
A ordem dos números exibidos na fila será diferente da ordem em que foram inseridos na lista porque, no passo 2, os dados são retirados da lista de forma ordenada do início para o fim e inseridos na pilha de forma invertida, do fim para o início. No passo 3, os dados são retirados da pilha na ordem inversa e inseridos na fila, resultando em uma ordem diferente da original.

No passo 5, o programa repete o processo do passo 2 e 3, mas agora com os números de 6 a 10, que serão inseridos na lista depois dos números de 1 a 5. Como a inserção na fila é feita sempre no final, sem levar em conta a ordem original da lista, a ordem dos números exibidos na fila será 1 2 3 4 5 10 9 8 7 6, ou seja, diferente da ordem original da lista.
