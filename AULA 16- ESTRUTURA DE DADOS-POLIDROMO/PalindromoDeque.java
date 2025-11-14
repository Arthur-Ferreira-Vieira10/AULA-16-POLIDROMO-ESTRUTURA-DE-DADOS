import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class PalindromoDeque {

    public static String limparEntrada(String entrada) {
        return entrada.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }

    public static boolean verificarPalindromo(String entrada) {
        String limpa = limparEntrada(entrada);
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : limpa.toCharArray()) {
            deque.add(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n===== MENU PALÍNDROMO =====");
            System.out.println("1 - Verificar Palavra");
            System.out.println("2 - Verificar Frase");
            System.out.println("3 - Verificar Número");
            System.out.println("4 - Verificar Data (formato DD/MM/AAAA)");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("\nDigite uma palavra: ");
                    String palavra = sc.nextLine();
                    if (verificarPalindromo(palavra))
                        System.out.println("É palíndromo!");
                    else
                        System.out.println("Não é palíndromo.");
                    break;

                case 2:
                    System.out.print("\nDigite uma frase: ");
                    String frase = sc.nextLine();
                    if (verificarPalindromo(frase))
                        System.out.println("É palíndromo!");
                    else
                        System.out.println("Não é palíndromo.");
                    break;

                case 3:
                    System.out.print("\nDigite um número: ");
                    String numero = sc.nextLine();
                    if (verificarPalindromo(numero))
                        System.out.println("É palíndromo!");
                    else
                        System.out.println("Não é palíndromo.");
                    break;

                case 4:
                    System.out.print("\nDigite uma data (DD/MM/AAAA): ");
                    String data = sc.nextLine();
                    if (verificarPalindromo(data))
                        System.out.println("É palíndromo!");
                    else
                        System.out.println("Não é palíndromo.");
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}
