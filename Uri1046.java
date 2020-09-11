import java.util.Scanner;
public class Uri1046{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        int inicio, fim, resultado, resultado1;

        inicio = teclado.nextInt();
        fim    = teclado.nextInt();
        resultado = fim - inicio;

        if (resultado >= 1 && resultado <= 24){
            System.out.print("O JOGO DUROU "+resultado);
            System.out.println(" HORA(S)");
        }
        else if (resultado <= 0){
            resultado1 = resultado + 24;
            System.out.print("O JOGO DUROU "+resultado1);
            System.out.println(" HORA(S)");
        }     
        }
    }