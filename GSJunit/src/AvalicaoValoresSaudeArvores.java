import java.util.Scanner;

public class AvalicaoValoresSaudeArvores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1, n2, n3;
        System.out.print("Entre com o número inteiro que aponta o status de saúde da árvore, na 1ª medição: ");
        n1 = sc.nextInt();
        System.out.print("Entre com o número inteiro que aponta o status de saúde da árvore, na 2ª medição: ");
        n2 = sc.nextInt();
        System.out.print("Entre com o número inteiro que aponta o status de saúde da árvore, na 3ª medição ");
        n3 = sc.nextInt();
        if (n1 > n2) {
            if (n1 > n3) {
                if (n2 < n3) {
                    System.out.println("O menor numero eh: " + n2);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n1);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        } else {
            if (n2 > n3) {
                if (n1 < n3) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n3);
                }
                System.out.println("O maior numero eh: " + n2);
            } else {
                if (n1 < n2) {
                    System.out.println("O menor numero eh: " + n1);
                } else {
                    System.out.println("O menor numero eh: " + n2);
                }
                System.out.println("O maior numero eh: " + n3);
            }
        }
    }
}