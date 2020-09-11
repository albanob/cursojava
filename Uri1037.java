import java.util.Scanner;
public class Uri1037{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A;

        A = teclado.nextDouble();
        
        if ( (A>=0.0) && (A<=25.0) ){
            System.out.println("Intervalo [0,25]");
        }
        else if ((A>25.0) && (A<=50.0)){
            System.out.println("Intervalo (25,50]");}
        else if ((A>50.0) && (A<=75.0)){
            System.out.println("Intervalo (50,75]");}
        else if ((A>75.0) && (A<=100.0)) {
            System.out.println("Intervalo (75,100]");
        }
        else if (A<0) {
            System.out.println("Fora de Intervalo");
        }
        else{
            System.out.println("Fora de Intervalo");
        }
    }
}