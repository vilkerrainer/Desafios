import java.util.*;

public class Desafio5 {
    public static void main (String[] args){
        Scanner recebePalavra = new Scanner(System.in);
        System.out.println("Digite uma palavra: ");
        String palavra = recebePalavra.next();

        String palavraInvertida = "";

        for (int i = palavra.length() - 1; i >=0; i--) {
            palavraInvertida += palavra.charAt(i);
        }
        System.out.println("Palavra invertida: " + palavraInvertida);
        recebePalavra.close();
    }
}
