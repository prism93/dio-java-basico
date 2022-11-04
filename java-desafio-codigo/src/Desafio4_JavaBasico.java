import java.util.Scanner;
public class Desafio4_JavaBasico {
    public static void main(String[] args) {
    Scanner number = new Scanner(System.in);

    // System.out.println("Digite um número: ");
     int num = number.nextInt();
     verificar(num);
 }
 static void verificar(int num){
     if (num % 3 == 0 && num % 5 == 0) {
         System.out.println("FizzBuzz");
     } else if (num % 3 == 0 || num % 5 == 0) {
         if (num % 3 == 0){
             System.out.println("Fizz");
         } else {
             System.out.println("Buzz");
         }
     } else {
         System.out.println(num);
     }
 }
}
    

