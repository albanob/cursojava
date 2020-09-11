import java.util.Scanner;
public class Uri1074{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N, valor;
        int contador;

        N  = teclado.nextInt();
        for(contador = 1; contador<=N; contador = contador+1){
            valor  = teclado.nextInt();
            if (valor == 0){
            System.out.println("NULL");
            }
            if (valor%2 == 0 && valor>0){
            System.out.println("EVEN POSITIVE");
            }
            if (valor%2 != 0 && valor>0){
            System.out.println("ODD POSITIVE");
            }
            if (valor%2 == 0 && valor<0){
            System.out.println("EVEN NEGATIVE");
            }
            if (valor%2 != 0 && valor<0){
            System.out.println("ODD NEGATIVE");
            }
        }
    }  
    }