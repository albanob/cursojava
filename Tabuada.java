import java.util.Scanner;
public class Tabuada{
    public static void main (String args[]){
        Scanner teclado =new Scanner (System.in);

        int valor, contador;

        System.out.println("Digite o valor da tabuada");
        valor = teclado.nextInt();
        contador = 1;
        while (contador <10){
            System.out.println(valor + " x "+contador+ " = "+(valor*contador));
            contador = contador + 1;

        }
    }
}