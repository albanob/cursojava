import java.util.Scanner;
public class Exemploif{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float n1, n2, media;

        System.out.println("Digite a nota da P1");
        n1 = teclado.nextFloat();
        System.out.println("Digite a nota da P2");
        n2 = teclado.nextFloat();

        media = (n1+n2)/2;

        System.out.println("Sua nota media ="+media);

        if (media >= 6){
             System.out.println("Parabens voce esta aprovado/a");
        }
        else {
            System.out.println("Pootz..num deu! Estude mais");
        }
        
        System.out.println("Fim do Programa");
    }
}