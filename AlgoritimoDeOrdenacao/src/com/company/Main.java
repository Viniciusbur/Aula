package com.company;


public class Main {

    public static void main(String[] args) {

    Metodos metodos = new Metodos();
    int []vetorBubble1 = new int[50];

    vetorBubble1 = metodos.geraVetor(50,50);

    int []vetorBubble2 = vetorBubble1;
    int []vetorIncertion = vetorBubble1;
    int []vetorSelection = vetorBubble1;


    System.out.println(metodos.mostraVetor(vetorBubble1)+
            "\n" + metodos.mostraVetor(vetorBubble2)+
            "\n" + metodos.mostraVetor(vetorIncertion)+
            "\n" + metodos.mostraVetor(vetorSelection));

    metodos.bubbleSort1(vetorBubble1);
    metodos.bubbleSort2(vetorBubble2);
    metodos.insertionSort(vetorIncertion);
    metodos.selection_sort(vetorSelection);


    System.out.println("Vetores Ordenados \n Bubble Sort 1"
            + metodos.mostraVetor(vetorBubble1)+
            "\n Numero do contador: "+metodos.getContBubble1() );

    System.out.println("\n Bubble Sort 2"
            + metodos.mostraVetor(vetorBubble2)+
            "\n Numero do contador: "+metodos.getContBubble2() );

    System.out.println("\n Incertion Sort"
            + metodos.mostraVetor(vetorIncertion)+
            "\n Numero do contador: "+metodos.getContIncertion() );

    System.out.println("\n Selection Sort"
            + metodos.mostraVetor(vetorSelection)+
            "\n Numero do contador: "+metodos.getContSelection() );

    }
}
