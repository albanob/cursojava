import java.util.Scanner;

public class Exercicio2d{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 
        int d1, d2, area;

        System.out.println("Por favor, digite o valor da diagonal 1");
        d1 = teclado.nextInt();

        System.out.println("Por favor, digite o valor da diagonal 2");
        d2 = teclado.nextInt();

        area = d1 * d2;

        System.out.println("A area do losangulo vale "+area);

    }

}