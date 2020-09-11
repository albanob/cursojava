import java.util.Scanner;

public class Exercicio2b{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 

        // entradas: base e altura
        // saída: area
        
        int lado, altura, area;

        System.out.println("Por favor, digite o valor do lado do retangulo");
        lado = teclado.nextInt();

        System.out.println("Por favor, digite o valor da altura do retangulo");
        altura = teclado.nextInt();

        area = lado * altura;

        System.out.println("A area do retangulo vale "+area);

    }

}