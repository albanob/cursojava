import java.util.Scanner;

public class Exercicio2f{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 
        int profundidade, largura, altura, volume;

        System.out.println("Por favor, digite o valor da altura");
        altura = teclado.nextInt();

        System.out.println("Por favor, digite o valor da largura");
        largura = teclado.nextInt();

        System.out.println("Por favor, digite o valor da profundidade");
        profundidade = teclado.nextInt();

        volume = altura * largura * profundidade;

        System.out.println("O volume do paralelepipedo vale "+volume);
    }

    }
