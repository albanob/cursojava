import java.util.Scanner;
public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int CD1, N1, CD2, N2;
        double VU1, VU2, total;

        CD1 = teclado.nextInt();
        N1  = teclado.nextInt();
        VU1 = teclado.nextDouble();
    
        CD2 = teclado.nextInt();
        N2  = teclado.nextInt();
        VU2 = teclado.nextDouble();

        total = (N1 * VU1 + N2 *VU2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n",total);
    }
}