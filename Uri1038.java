import java.util.Scanner;
public class Uri1038{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo, qtd;
        double total;

        codigo = teclado.nextInt();
        qtd    = teclado.nextInt();
        
        if (codigo == 1){
            total = 4.0*qtd;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if (codigo == 2){
            total = 4.5*qtd;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if (codigo == 3){
            total = 5.0*qtd;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if (codigo == 4){
            total = 2.0*qtd;
            System.out.printf("Total: R$ %.2f\n",total);
        }
        else if (codigo == 5){
            total = 1.5*qtd;
            System.out.printf("Total: R$ %.2f\n",total);
        }
    }
}