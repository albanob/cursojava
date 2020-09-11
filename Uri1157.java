import java.util.Scanner;
public class Uri1157{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N;
        N  = teclado.nextInt();

        for(int contador = 1; contador<=N; contador++){
           if (N % contador == 0){
               System.out.println(contador);
           }
        }
    }
    } 