import java.util.Random;

public class Metodos {

    private long tempoIni = 0, tempoFim = 0;

    public long getTempoIni() {
        return tempoIni;
    }

    public long getTempoFim() {
        return tempoFim;
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

    public String toString(int vetor[]){
        String imprime = "";
        for(int i = 0; i<vetor.length;i++){
             imprime += "\n" + vetor[i];
        }

        return imprime;
    }

    int pesqDireta(int [] vet, int valor) {
        int res = -1, i;
        for (i = 0; ((i < vet.length) && (vet[i] != valor)); i++);
        if (i < vet.length){
            res = i;
        return res;}
        else  return -5;
    }



    public void initClock() {
        tempoIni = tempoFim = System.nanoTime();
    }

    public double getClockSec() {
        double res;

        tempoFim = System.nanoTime();

        res =  ((double)tempoFim - (double)tempoIni) / (double)1_000_000_000.0;

        return res;
    }

    public void ordenaVetor(int num[], int tam) {
        int min, max, aux;
        for (int i = 0; i < tam - 1; i++) {
            min = i;
            for (int j = (i + 1); j < tam; j++) {
                if (num[j] < num[min]) {
                    min = j;
                }
            }
            if (i != min) {
                aux = num[i];
                num[i] = num[min];
                num[min] = aux;
            }
        }
    }
        public int binarySearch(int num[], int value){
            int low = 0;
            int high = num.length - 1;
            int p = low + ((high-low)/2);
            while (low <= high)
            {
                if (num[p] > value) {
                    high = p - 1;
                }else if (num[p] < value) {
                    low = p + 1;
                }else{
                 p = low + ((high-low)/2);
                return p;

                }
            }
            return -1;
        }


    }





