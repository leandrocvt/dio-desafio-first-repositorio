# ☕Estrutura de Dados Java.

Como estrutura os dados na memória do computador.

🔹O bit

🔹Organizar dados em Memória

🔹Mecanismos de organização de dados que atendem diferentes requisitos de processamento.

---

## 🎲 Tipos de Dados

imagem aqui.

## Atribuição e Referência

* As atrubição em Java são por cópia de valor sempre;

* Com tipo primitivo, copiamos o valor em memória;

* Com objetos copiamos o valor da referência em memória, sem duplicar o objeto.

---

## Conceito de Nó

Ele é um espaço em memória que armazena um dado ou uma referência para um próximo nó. Esses nós podem
ser encadeados (amarrados) por referência na memória. Ultimo nó aponta se para null.

## Generics

* Evitar casting excessivo

* Evitar códigos redundantes

* Encontrar erros em tempo de compilação

* Introduzido desde Java SE 5.0

### Unknown Widcard

    public void imprimirLista(List<?> lista){
        for(Object obj : lista){
            System.out.println(obj);
        }
    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimirLista(minhaLista);

### UpperBounded Wildcard

     public void imprimirLista(List<? extends Pessoa> lista){
        for(Pessoa p : listaPessoas){
            System.out.println(p);
        }
    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimirLista(minhaLista);

### LowerBounded Wildcard

     public void imprimirLista(List<? super Pessoa> lista){
        for(Pessoa p : listaPessoas){
            System.out.println(p);
        }
    }

    List<Aluno> minhaLista = new List<Aluno>();
    imprimirLista(minhaLista); 


### Convenção

* K para "Key", exemplo: Map<K, V>
* V para "Value", exemplo: Map<K, V>
* E para "Element", exemplo: List<E>
* T para "Type", exemplo: Collections#addAll
* ? quando genérico

---

## Pilhas (Last In, First Out)

Em Java, uma pilha (também conhecida como stack) é uma estrutura de dados que segue o princípio Last In, First Out (LIFO), o que significa que o último elemento adicionado à pilha é o primeiro a ser removido. Em outras palavras, a pilha funciona como uma pilha de pratos, onde o último prato colocado é o primeiro a ser retirado.

Em Java, a classe Stack é uma implementação de uma pilha. Ela fornece vários métodos para manipular a pilha, incluindo:

* push(Object item): adiciona um elemento ao topo da pilha
* pop(): remove e retorna o elemento no topo da pilha
* peek() ou top(): retorna o elemento no topo da pilha sem removê-lo
* empty(): retorna true se a pilha estiver vazia, false caso contrário.

Exemplo: 

    import java.util.Stack;

    public class ExemploPilha {
        public static void main(String[] args) {
            Stack<Integer> pilha = new Stack<>();

            pilha.push(10);
            pilha.push(20);
            pilha.push(30);

            System.out.println(pilha.pop()); // saída: 30
            System.out.println(pilha.pop()); // saída: 20
            System.out.println(pilha.peek()); // saída: 10
            System.out.println(pilha.empty()); // saída: false
        }
    }

---

## Filas (First In, First Out)

Em Java, é possível implementar filas (ou queues, em inglês) utilizando a interface Queue, que é uma subinterface de Collection. Essa interface define métodos para adicionar, remover e verificar elementos em uma fila, seguindo a política First In, First Out (FIFO), ou seja, o primeiro elemento a ser inserido é o primeiro a ser removido.

Exemplo: 

    import java.util.LinkedList;
    import java.util.Queue;

    public class ExemploFila {
        public static void main(String[] args) {
            Queue<String> fila = new LinkedList<>();

            // adicionando elementos à fila
            fila.add("elemento1");
            fila.add("elemento2");
            fila.add("elemento3");

            // verificando o primeiro elemento da fila sem removê-lo
            System.out.println("Primeiro elemento da fila: " + fila.peek());

            // removendo o primeiro elemento da fila
            String primeiroElemento = fila.remove();
            System.out.println("Elemento removido: " + primeiroElemento);

            // percorrendo e removendo todos os elementos da fila
            while (!fila.isEmpty()) {
                String elemento = fila.remove();
                System.out.println("Elemento removido: " + elemento);
            }
        }
    }

## Lista encadeada

Uma lista encadeada é uma estrutura de dados em que cada elemento, chamado de nó, contém um valor e um ponteiro que aponta para o próximo nó na lista. Em Java, podemos implementar uma lista encadeada da seguinte forma:

        public class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public class LinkedList {
            Node head;

            public LinkedList() {
                this.head = null;
            }

            public void add(int data) {
                Node newNode = new Node(data);

                if (head == null) {
                    head = newNode;
                } else {
                    Node current = head;

                    while (current.next != null) {
                        current = current.next;
                    }

                    current.next = newNode;
                }
            }

            public void printList() {
                Node current = head;

                while (current != null) {
                    System.out.print(current.data + " ");
                    current = current.next;
                }
            }
        }
