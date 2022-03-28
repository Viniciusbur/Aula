import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {

    int []vetor = null;
    int tamanhoVetor = 10 ;
    Metodos metodos = new Metodos();

    vetor = new int[tamanhoVetor];
    vetor = metodos.geraVetor(tamanhoVetor, 1000);

    Arrays.sort(vetor);

    System.out.println(metodos.toString(vetor));
    System.out.println(metodos.getClockSec());
    System.out.println(metodos.pesqDireta(vetor, 50));
    System.out.println(metodos.binarySearch(vetor, 50));


    }
}
