import java.util.Scanner;
public class Uri1009{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String nome;
        double salariobruto, totalvendas, salarioliquido;

        nome = teclado.nextLine(); // aqui eu leio uma String até o ENTER
        salariobruto = teclado.nextDouble();
        totalvendas = teclado.nextDouble();
        
        salarioliquido = salariobruto + totalvendas*0.15;
      
        System.out.printf("TOTAL = R$ %.2f\n",salarioliquido);
    
    }
}