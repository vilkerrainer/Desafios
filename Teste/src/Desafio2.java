import java.util.*;
public class Desafio2 {
    static long fibonacci(int n) {
        int nAtual = 0;
        int nAnterior = 0;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                nAtual = 1;
                nAnterior = 0;
            } else {
                nAtual += nAnterior;
                nAnterior = nAtual - nAnterior;
            }
        }
        return nAtual;
    }
    public static void main (String[] args) {
        Scanner informarNumero = new Scanner(System.in);
        int numero = 0;
        boolean pertence = false;
        System.out.println("Digite um número: ");
        numero = informarNumero.nextInt();


        for (int i = 0; i <= numero; i++) {
            if (numero == Desafio2.fibonacci(i)) {
                pertence = true;
                break;
            }
        }
        if (pertence) {
            System.out.println("Pertence a sequência");
        } else {
            System.out.println("Não pertence a sequência");
        }
        informarNumero.close();
    }
}

