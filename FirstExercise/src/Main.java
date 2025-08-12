import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ingrese un numero");
        Scanner sc = new Scanner(System.in);

        int numero = sc.nextInt();

        int divisor = 0;

        for (int i =1; i<=numero; i++){
            if (numero % i == 0){
                divisor++;
            }
        }

        if (divisor == 2){
            System.out.println("El numero es primo");
        }else {
            System.out.println("El numero no es primo");
        }

    }
}