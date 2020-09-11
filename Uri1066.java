import java.util.Scanner;
public class Uri1066{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int valor;
        int contador;
        int numeropositivo = 0; 
        int numeronegativo = 0;
        int numeropar = 0; 
        int numeroimpar = 0;


        for (contador = 1; contador <=5; contador = contador +1){
            valor  = teclado.nextInt();
            if (valor %2 == 0){
                numeropar = numeropar +1;
            }
            else if (valor %2 != 0){
                numeroimpar = numeroimpar +1;
            }

            else if (valor > 0){
                numeropositivo = numeropositivo +1;
            }

            else if (valor < 0){
                numeronegativo = numeronegativo +1;
            }
        
    }
        System.out.println(numeropar+" valor(es) par(es)");
        System.out.println(numeroimpar+" valor(es) impar(es)");
        System.out.println(numeropositivo+" valor(es) positivo(s)");
        System.out.println(numeronegativo+" valor(es) negativo(s)");
    }
}