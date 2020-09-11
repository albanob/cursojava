import java.util.Scanner;
public class Uri1134{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int codigo;
        int alcool = 0;
        int gasolina = 0; 
        int diesel = 0;

        do {
            codigo  = teclado.nextInt();
            if (codigo == 1){
                alcool = alcool +1;
            }
            if (codigo == 2){
                gasolina = gasolina +1;
            }
            if (codigo == 3){
                diesel = diesel +1;
            } } while (codigo != 4);
                System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: "+alcool);
                System.out.println("Gasolina: "+gasolina);
                System.out.println("Diesel: "+diesel);
        }
    }  
    