import java.util.Scanner;

public class Exercicio2e{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 
        int b1, b2, altura, area;
        // definindo a entrada
        System.out.println("Por favor, digite o valor da base 1");
        b1 = teclado.nextInt();

        System.out.println("Por favor, digite o valor da base 2");
        b2 = teclado.nextInt();

        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();
        
        // definindo o processamento
        area = (b1 + b2)*altura/2;

        // definindo a saída
        System.out.println("A area do trapezio vale "+area);
    }

    }

