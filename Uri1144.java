import java.util.Scanner;
public class Uri1144{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N;
        int contador, contador1, contador2, contador3, contador4;

        N  = teclado.nextInt();
        for (contador = 1; contador<=N; contador = contador+1){
            contador1 = (int)Math.pow(contador,2);
            contador2 = (int)Math.pow(contador,3);
            contador3 = contador1 +1;
            contador4 = contador2 +1;
            System.out.println(contador+" "+contador1+" "+contador2);
            System.out.println(contador+" "+contador3+" "+contador4);
        }
        }
    }  