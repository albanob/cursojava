import java.util.Scanner;
public class Uri1154{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int idade;
        int qtdidade = 0;
        double media = 0;
       
        do {
            idade  = teclado.nextInt();
            if (idade >= 0){
                media = media +idade;
                qtdidade++;
            }
            } while (idade > 0);

        
        media = media/qtdidade;
        System.out.printf("%.2f\n",media);
        }
    }  
    