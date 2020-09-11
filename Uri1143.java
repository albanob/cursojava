import java.util.Scanner;
public class Uri1143{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N;
        int contador, contador1, contador2;

        N  = teclado.nextInt();
        for (contador = 1; contador<=N; contador = contador+1){
            contador1 = (int)Math.pow(contador,2);
            contador2 = (int)Math.pow(contador,3);
            System.out.println(contador+" "+contador1+" "+contador2);
        }
        }
    }  