
import java.util.Scanner;
public class CalculadoraIdade {
    public static void main(String[] args) {

        Scanner leitorTeclado = new Scanner(System.in);

        //1 ->  pegar o ano atual
        //2 -> pegar o ano de nascimento
        //3 -> subtrair  o ano atual - o ano de nascimento

        System.out.println("Digite o ano atual:");
        int anoAtual = leitorTeclado.nextInt();

        System.out.println("Agora, digite o ano do seu nascimento");
        int anoNascimento = leitorTeclado.nextInt();

        int resultado = anoAtual - anoNascimento;


        System.out.println("Sua idade é: " + resultado);

        if (resultado < 18){
            System.out.println("Você é menor de idade: ");
        } else if (resultado < 60) {
            System.out.println("Você é maior de idade: ");
        } else {
            System.out.println("Você é um idoso");
        }

        leitorTeclado.close();
    }
}
