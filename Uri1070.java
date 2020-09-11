import java.util.Scanner;
public class Uri1070{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int X;
        int contador;

        X  = teclado.nextInt();
        if (X%2 == 0){
            for (contador = X+1; contador<=X+11; contador = contador +2){
            System.out.println(contador);
            }
        }

        if (X%2 != 0){
            for (contador = X; contador<=X+10; contador = contador +2){
            System.out.println(contador);
            }
        }   
    }  
    }