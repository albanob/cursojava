import java.util.Scanner;

public class Exercicio2c{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in); 
        int base, altura,area;
        // definindo a entrada
        System.out.println("Por favor, digite o valor da base do triangulo");
        base = teclado.nextInt();

        System.out.println("Por favor, digite o valor da altura do triangulo");
        altura = teclado.nextInt();
        // definindo o processamento
        area = (base * altura)/2;
        
        // definindo a saída
        System.out.println("A area do triangulo vale "+area);

    }

}