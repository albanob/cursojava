import java.util.Scanner;
public class Uri1060{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        float valor;
        int contador;
        int numeropositivo = 0;


        for (contador = 1; contador <=6; contador = contador +1){
            valor  = teclado.nextFloat();
            if (valor > 0){
                numeropositivo = numeropositivo +1;
            }
        }
        System.out.println(numeropositivo+" valores positivos");

    }
}