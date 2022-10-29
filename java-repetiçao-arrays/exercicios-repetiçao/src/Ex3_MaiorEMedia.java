import java.util.Scanner;

public class Ex3_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int count = 0;
        int maior = 0;
        int soma = 0;
        double media = 0;

        do {
            System.out.print("Digite um número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            media = soma / 5;
            count = count + 1;
        } while (count < 5);


        System.out.println("Maior: " + maior);
        System.out.println("Média: " + media);





    }
}
