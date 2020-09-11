import java.util.Scanner;
public class Uri1073{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N;
        double potencia;
        int contador;

        N  = teclado.nextInt();
        if (N%2 == 0){
            for (contador = 2; contador<=N; contador = contador +2){
            potencia = Math.pow(contador,2);
            System.out.println(contador+"^2 = "+potencia);
            }
        }

        if (N%2 != 0){
            for (contador = 2; contador<N; contador = contador +2){
            potencia = Math.pow(contador,2);
            System.out.println(contador+"^2 = "+potencia);
            }
        } 
    }  
    }