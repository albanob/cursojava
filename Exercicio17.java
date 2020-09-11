import java.util.Scanner;
public class Exercicio17{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;

        salario = teclado.nextDouble();
        
        if (salario < 1000.0){
            imposto = 0.0;
        }
        else {
            if (salario >= 1000.0 && salario <2500){
             imposto = salario * 0.125;  
            }
            else{
                if (salario >= 2500 && salario <5000){
             imposto = salario * 0.25;  
                }
                else{
                    imposto = 1300.0;
                }
            }
        }
        System.out.println("Imposto devido R$ "+imposto);
    }
}