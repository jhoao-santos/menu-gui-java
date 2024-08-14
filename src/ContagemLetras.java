import java.util.Scanner;

public class ContagemLetras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite uma frase");


        String frase = scanner.nextLine();
        int quantidadeLetras = 0;

        for ( int indice = 0 ; indice < frase.length(); indice++) {
            char letra = frase.charAt(indice);
            boolean isletra = Character.isLetter(letra);


            if (isletra){
                quantidadeLetras++;
            }
        }


        System.out.println("A quantidade de letras é:" + quantidadeLetras);

        scanner.close();


    }
}
