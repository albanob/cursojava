import java.util.Scanner;
public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int X,Y;
        double litros, consumo;
        consumo = 12.0;

        X = teclado.nextInt();
        Y  = teclado.nextInt();
        
        litros = (X*Y)/consumo;
      
        System.out.printf("%.3f\n",litros);
    
    }
}