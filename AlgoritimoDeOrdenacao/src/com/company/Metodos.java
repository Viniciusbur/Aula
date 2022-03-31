package com.company;

import java.util.Random;

public class Metodos {

    private int contBubble1,contBubble2, contIncertion, contSelection;
    
    private long tempoIni, tempoFim;

    public int getContBubble1() {
        return contBubble1;
    }

    public int getContBubble2() {
        return contBubble2;
    }

    public int getContIncertion() {
        return contIncertion;
    }

    public int getContSelection(){
        return contSelection;
    }

    public int[] geraVetor(int nroElem, int lim) {
        int dummy;
        int[] res = null;
        int cont = 0;
        Random rnd = new Random(System.nanoTime() * System.currentTimeMillis());

        if (nroElem >= 0) {

            res = new int[nroElem];

            while (cont < nroElem) {
                dummy = rnd.nextInt(lim) + 1;
                dummy = rnd.nextInt(lim) + 1;
                res[cont++] = rnd.nextInt(lim) + 1;
            }
        }
        return res;
    }

    public void bubbleSort1(int vet[]) {
        for (int i = 0; i < vet.length - 1; i++) {
            contBubble1++;
            for (int j = 0; j < vet.length - 1 - i; j++) {
                contBubble1++;
                if (vet[j] > vet[j + 1]) {
                    int aux = vet[j];
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }


    public void bubbleSort2(int [] vet)
    {
        boolean trocou = true;
        while (trocou) {
            trocou = false;
            for (int i=0; i<vet.length-1; i++) {
                contBubble2++;
                if (vet[i] > vet[i+1]) {
                    contBubble2++;
                    int aux = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = aux;
                    trocou = true;
                }
            }
        }
    }


    public void insertionSort(int [] v)
    {
        int i, j, chave;
        for (j=1; j<v.length; j++) {
            contIncertion++;
            chave = v[j];
            i = j - 1;
            while ((i >= 0) && (v[i] > chave)) {
                contIncertion++;
                v[i+1] = v[i];
                i = i - 1;
            }
            v[i+1] = chave;
        }
    }

    public void selection_sort(int num[])
    {
        int i, j, min, aux;
        for (i = 0; i < (num.length-1); i++)
        {
            contSelection++;
            min = i;
            for (j = (i+1); j < num.length; j++) {
                contSelection++;
                if(num[j] < num[min]) {
                    min = j;
                }
            }
            if (i != min) {
                contSelection++;
                aux = num[i];
                num[i] = num[min];
                num[min] = aux;
            }
        }
    }
    
    public void initClock() {
    tempoIni = tempoFim = System.nanoTime();
    }

    public double getClockSec() {

        double res;

        tempoFim = System.nanoTime();
        res = ((double)tempoFim - (double)tempoIni) / (double)1000000000.0;

        return res;

    }


    public String mostraVetor(int []vet){
        String vetor = "";
        for (int i = 0; i<vet.length;i++){
            vetor += " " + vet[i];
        }
        return vetor;
    }


}
