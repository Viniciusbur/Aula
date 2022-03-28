

public class Principal {

    public static void main(String[] args) {

    int []vetor = null;


    Metodos metodos = new Metodos();

    vetor = new int[100];

    vetor = metodos.geraVetor(100, 100);

    System.out.println(metodos.imprime(vetor));

    }


}
