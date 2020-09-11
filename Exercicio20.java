import java.util.Scanner;
public class Exercicio20{
    public static void main(String args[]){
    
        Scanner teclado = new Scanner(System.in);

        double altura;
        char sexo;
        double pesoideal;

        System.out.println("Digite F/fpara Feminino ou M/m para Masculino");
        sexo = teclado.nextLine().charAt(0);
        System.out.println("Digite altura em metros");
        altura = teclado.nextDouble();
        switch (sexo){
            case 'F':
            case 'f':
                pesoideal = 62.1*altura -44.7;
                System.out.printf("Seu peso ideal feminino é de %.2f\n", pesoideal);
                break;
            default:
                System.out.println("Valores nao reconhecidos");

        }
        }

        } 
