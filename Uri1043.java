import java.util.Scanner;
public class Uri1043{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double a,b,c, perimetro,area;

        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        
        if ( (a+b)>c && (c+b)>a && (c+a)>b ){
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n",perimetro);
        }
        else {
            area = (a+b)*c/2;
            System.out.printf("Area = %.1f\n",area);
        }
        
    }
}