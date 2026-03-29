import java.util.Scanner;

public class MenuTentativas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char resposta;
        int tentativas = 0;
        boolean acertou = false;

        do {
            System.out.println("\nQual estrutura de repetição podemos chamar de \"sentinela\"?");
            System.out.println("A - for");
            System.out.println("B - while");
            System.out.println("C - do-while");
            System.out.println("D - if");

            System.out.print("Digite sua resposta: ");
            resposta = sc.next().charAt(0);
            resposta = Character.toUpperCase(resposta);

            tentativas++;

            if (resposta == 'B') {
                acertou = true;
                System.out.println("Resposta correta!");
            } else {
                System.out.println("Resposta incorreta!");
            }

        } while (!acertou && tentativas < 3);

        // Resultado final
        if (acertou) {
            System.out.println("Você acertou em " + tentativas + " tentativa(s)!");
        } else {
            System.out.println("Você errou 3 vezes!");
        }

        sc.close();
    }
}