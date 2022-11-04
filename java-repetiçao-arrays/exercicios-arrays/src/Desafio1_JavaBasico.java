import java.util.Scanner;

public class Desafio1_JavaBasico {
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int A;
            int B;


            A = scan.nextInt();
            B = scan.nextInt();

            if (A == B){
                System.out.print("São iguais!");
            }else{
                System.out.print("Não são iguais!");
            }



        }
}
