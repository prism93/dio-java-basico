import java.util.Scanner;

public class Desafio2_JavaBasico {
        public static void main(String[] args) {
        int A, N;
        int soma = 0;

        Scanner input = new Scanner(System.in);
       // System.out.println("Digite o valor de A: ");
        A = input.nextInt();
       // System.out.println("Digite o valor de N: ");
        N = input.nextInt();

        for(int i = 1; i <= N; i++){
            if(i % A == 0) {
                soma += i; 
            }
        }

        System.out.println(soma);
    }
}

