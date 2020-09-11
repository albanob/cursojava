import java.util.Scanner;

public class Exercicio2g{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 
        int lado, volume;

        System.out.println("Por favor, digite o valor do lado");
        lado = teclado.nextInt();

        volume = lado * lado * lado;

        System.out.println("O volume do cubo vale "+volume);
    }

    }
