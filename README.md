# Abstract Data Types (ADTs)

- Estrutura de dados que é um container com número finito de objetos
- Existe uma relação entre os objetos
- São omitidos os detalhes de implementação de cada tipo
- Exitem métodos padrões para manipulação dos dados armazenados

# Linear Abstract Data Types ( Linear ADTs)

- Dados finitos
- Cada objeto tem 1 antecessor imediato
- Cada objeto tem 1 sucessor imediato

![List Big O notation](https://github.com/hader-araujo/algorithms/blob/main/src/main/resources/images/Big-O_ADT.png)

## [ArrayList](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/arraylist/ArrayListImplementation.java)

- Buscar por id, inserir, deletar - O(1) *
- Busca/Pesquisa - 0(n)
- IsEmpty(), clear(), size()


* inserir em ArrayList no caso o array cheio, é O(n), mas esse valor é amortizado

## [Linked List](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/linkedlist)

- Contém variável head que é um Node (valor e referência para o próximo Node)
- não contém busca/pesquisa

### [Singly linked list (SLL)](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/singlylinkedlist/SinglyLinkedList.java)

- addToFront e removeFromFront - O(1)
- addToBack e removeFromBack - O(n)

### [SLL com variável size](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/singlylinkedlist/SinglyLinkedListOptimizationWithSize.java)

- Contém variável size e é utilizada nos 'edge cases' para verificar se a lista está vazia
- addToFront e removeFromFront - O(1)
- addToBack e removeFromBack - O(n)

### [SLL com variável tail](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/singlylinkedlist/SinglyLinkedListOptimizationWithTail.java)

- Contém variável tail que é um Node com referencia para o último node da lista
- addToFront e removeFromFront - O(1)
- **addToBack - O(1)**
- removeFromBack - O(n)
- adiciona novos edge cases nos métodos addToFront e removeFromFront quando size é 0 ou 1

### [SLL com Iterable](https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/singlylinkedlist/SinglyLinkedListOptimizationWithTailIterable.java)

- implements Iterable
- método iterator() retorna uma instância de uma subclasse de Iterator
- Subclasse de Iterator contém método hasNest() e next()

#### [Recursion in LinkedLists]((https://github.com/hader-araujo/algorithms/blob/main/src/main/java/linkedlist/singlylinkedlist/SinglyLinkedListOptimizationWithSizeWithMethodRemoveAllDuplicates.java))

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

## [Stack](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/stack)

- LIFO (Last In, Fist Out)
- Não tem pesquisa
- Não acessa elementos a não ser o último adicionado
- Operações suportadas:
    - void push(x): adiciona elemento no final
    - x pop(): remove último elemento adicionado
    - x peek() / x top(): retorna último elemento adicionado sem remover
    - boolean isEmpty(): retorna se está vazio
    - void clear(): limpa a pilha removendo todos os elementos
- Operações NÃO suportadas:
    - searching for data
    - Arbitrary index access
    - Arbitrary add or remove

Stack é definido pelas suas operações e não pela sua estrutura de armazenamento dos dados.

![Stack Big O notation](https://github.com/hader-araujo/algorithms/blob/main/src/main/resources/images/Big-O_Stack.png)

## [Stack baseado em Singly Linked List](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/stack/SinglyLinkedListBackedStack.java)

- Não precisa de variável tail
- Não é utilizado/necessário Double Linked List (Double Linked List tem mais consumo de mémoria)
- São leves e simples
- Singly Linked List é a melhor opção para Stack
- push, pop, peek, isEmpty: O(1)

## [Stack baseado em Array](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/stack/ArrayBackedStack.java)

- Baseado em SLL é checado head, Baseado e Array é checado a variável size
- Operações são sempre no final do array: O(1)*
- clear(), 3 opções:
    - Apenas deixa os dados no array e seta o size para 0: O(1) mas garbage collect não tem opção de coletar os dados
    - Seta cada indice para null: O(n)
    - Seta o array para uma nova instância assim o garbage collect pode coletar os dados: O(1)

## [Queue](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/queue)

- FIFO (Fist In, Fist Out)
- Operações suportadas:
    - void enqueue(x): adiciona elemento no final (to the back of the queue)
    - x dequeue(): remove elemento do início (from front fo the queue)
    - x peek() / x top(): retorna elemento do início sem remover
    - boolean isEmpty(): retorna se está vazio
    - void clear(): limpa a fila removendo todos os elementos
- Operações NÃO suportadas:
    - searching for data
    - Arbitrary index access
    - Arbitrary add or remove

![Queue Big O notation](https://github.com/hader-araujo/algorithms/blob/main/src/main/resources/images/Big-O_Queue.png)

~~
## [Queue baseado em Linked List](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/queue/LinkedListBackedQueue.java)~~

~~- enqueue: O(n)~~
~~- dequeue, peek, isEmpty, clear: O(1)~~

## [Queue baseado em Linked List com variável tail](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/queue/LinkedListBackedQueueWithTail.java)

- Não é utilizado/necessário Double Linked List (Double Linked List tem mais consumo de mémoria)
- ~~add to head O(1), remove from tail O(n)~~ remove from the head O(1), add to tail o(1)
- enqueue, dequeue, peek, isEmpty, clear: O(1)

## [Queue baseado em Array](https://github.com/hader-araujo/algorithms/tree/main/src/main/java/queue/ArrayBackedQueue.java)

- Adicionar ou remover do início de um array é O(n), por isso é usado Array e não Array List.
- Usado Wrap-around or circular Array. Não é a mesma coisa que Circular Linked List
- Enqueue at the back and dequeue from the front
- Além da varável size, é utilizado front e back para armazenar seus respectivos indices
- Ao adicionar no final, variavel back é incrementada com modulo do tamanho do array (back = (back + 1) % arr.lenhth ),
  com isso, ao chegar no final, próximo indice torna o início do array
- ao remover do início, é usado mesma lógica, mas para a variável front
- Array precisa de resize quando size == arr.length
- enqueue: O(1)*
- dequeue, peek, isEmpty, clear: O(1)
- resize: O(n)

Stacks e Queues baseados em array são menos performáticos do que Linked List então **porque utilizá-los?**
Apesar que Stacks e Queues baseados em array são menos performáticos baseados em time complexity Big O Notation, eles
podem mais
performáticos pois a Virtual Machine pode prever os próximos passos de execução quando se tem um array e isso não pode
ser feito quando se te uma Linked List":

![Queue Big O notation](https://github.com/hader-araujo/algorithms/blob/main/src/main/resources/images/ArrayVSLinkedList.png)

# Recursividade

## GreatestCommonDivisor

// TODO detalhar

## SLL remove all duplicates

// TODO detalhar

