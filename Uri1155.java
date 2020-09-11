import java.util.Scanner;
public class Uri1155{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double S = 0;
        

        for(int contador = 1; contador<=100; contador++){
           S = S + 1.0/ (contador);
           }
        System.out.printf("%.2f\n",S);
        }
    }
