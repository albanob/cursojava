import java.util.Scanner;
public class Uri1051{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        double salario, imposto, imposto2,imposto3, impostototal;

        salario = teclado.nextDouble();

        if (salario<=2000){
            System.out.println("Isento");
        }
        else if (salario>2000.01 && salario<=3000){
            imposto = (salario-2000)*0.08;  
            System.out.printf("R$ %.2f\n",imposto);
        }
        else if (salario>3000.01 && salario<=4500){
            imposto = 1000.0*0.08;
            imposto2 = (salario-3000.0)*0.18;
            impostototal = imposto+imposto2;
            System.out.printf("R$ %.2f\n",impostototal);
            }

        else if (salario>4500){
            imposto = 1000*0.08;
            imposto2 = 1500*0.18;
            imposto3 = (salario-4500)*0.28;
            impostototal = imposto +imposto2+imposto3;
            System.out.printf("R$ %.2f\n",impostototal);
        }
    }     
}
