import java.util.Scanner;
public class Uri1064{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        float valor, media = 0;
        int contador;
        int numeropositivo = 0;


        for (contador = 1; contador <=6; contador = contador +1){
            valor  = teclado.nextFloat();
            if (valor > 0){
                numeropositivo = numeropositivo +1;
                media = media + valor;
            }
        }
        media = media/numeropositivo;
        System.out.println(numeropositivo+" valores positivos");
        System.out.printf("%.1f\n",media);

    }
}