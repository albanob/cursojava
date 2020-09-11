import java.util.Scanner;
public class Uri1158{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int X, Y, N;
        int soma = 0;
        N  = teclado.nextInt();
        for (int cont =1; cont<= N; cont++){
         X  = teclado.nextInt();
         Y  = teclado.nextInt();  
        if (X %2 == 0){
            X++;
        }
        soma = 0;
        for(int contador = 1; contador<=Y; contador++){
            soma = soma + X;
            X = X+2;
           }
        System.out.println(soma);
        }
    }
}

