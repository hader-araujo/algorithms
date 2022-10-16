# Abstract Data Types (ADTs)

## [ArrayList](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/arraylist/ArrayListImplementation.java)

- Buscar por id, inserir, deletar - O(1) *
- Busca/Pesquisa - 0(n)
- IsEmpty(), clear(), size()


* inserir em ArrayList no caso o array cheio, é O(n), mas esse valor é amortizado

## [Linked List](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/linkedlist)

- Contém variável head que é um Node (valor e referência para o próximo Node)
- não contém busca/pesquisa

### [Singly linked list (SLL)](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/simplelinkedlist/SimpleLinkedList.java)

- addToFront e removeFromFront - O(1)
- addToBack e removeFromBack - O(n)

### [SLL com variável size](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/simplelinkedlist/SimpleLinkedListOptimizationWithSize.java)

- Contém variável size e é utilizada nos 'edge cases' para verificar se a lista está vazia
- addToFront e removeFromFront - O(1)
- addToBack e removeFromBack - O(n)

### [SLL com variável tail](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/simplelinkedlist/SimpleLinkedListOptimizationWithTailTest.java)

- Contém variável tail que é um Node com referencia para o último node da lista
- addToFront e removeFromFront - O(1)
- **addToBack - O(1)**
- removeFromBack - O(n)
- adiciona novos edge cases nos métodos addToFront e removeFromFront quando size é 0 ou 1

### [SLL com Iterable](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/simplelinkedlist/SimpleLinkedListOptimizationWithTailIterable.java)

- implements Iterable
- método iterator() retorna uma instância de uma subclasse de Iterator
- Subclasse de Iterator contém método hasNest() e next()

#### [Recursion in LinkedLists]((https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/simplelinkedlist/SimpleLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates.java))

- Com acesso interno a SLL, objetos ordernados, remover todos os objetos duplicados.
- Isso feito em O(n)

### [Double linked list (DLL)](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/doublylinkedlist/DoublyLinkedList.java)

- Contém variável head e tail que é um Node (valor e referência para o próximo Node e **node anterior**)
- Usa mais memória, mas é muito mais eficiente do que SLL
- addToFront, removeFromFront, addToBack e removeFromBack - O(1) - usando next e previus referências
- adiciona novos edge cases nos métodos ao remover com size igual 1

### [Circular linked list (CLL)](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/circularlylinkedlist/CircularlyLinkedList.java)

- Método next do último node aponta para head
- Não precisa da variável tail
- addToFront: 0(1): create new Node com valor de head na posição 1 -> insere o novo valor em head (posição 0)
- addToBack: 0(1): create new Node com valor de head na posição 1 -> insere o novo valor em head (posição 0) -> head
  passa a
  ser posição 1 (head = head.next)
- removeFromFront: 0(1): valor de head recebe valor da posição 1 -> node da posição 1 passa a ser da posição 2 (
  head.next =
  head.next.next) - aumenta um edge case para size == 1
- removeFromBack: 0(n): precisa percorrer toda a lista para obter um node antes do último e ele passar a apontar para
  head

![alt text](https://github.com/hader-araujo/algorithms/blob/main/src/main/resources/images/Big-O_ADT.png)

# Recursividade

## GreatestCommonDivisor

// TODO detalhar

## SLL remove all duplicates

// TODO detalhar

