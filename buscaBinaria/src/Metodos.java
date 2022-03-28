import java.util.Random;

public class Metodos {

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

    public String imprime(int vetor[]){
        String imprime = "";
        for(int i = 0; i<vetor.length;i++){
             imprime += " " + vetor[i];
        }

        return imprime;
    }

    int pesqDireta(int [] vet, int valor) {
        int res = -1, i;
        for (i = 0; ((i < vet.length) && (vet[i] != valor)); i++);
        if (i < vet.length)
            res = i;
        return res;
    }


}
