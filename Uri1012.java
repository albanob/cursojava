import java.util.Scanner;
public class Uri1012{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double A, B, C, atriangulo,acirculo, atrapezio, aquadrado, aretangulo, pi;
        pi = 3.14159;

        A = teclado.nextDouble();
        B  = teclado.nextDouble();
        C = teclado.nextDouble();

        atriangulo = (A * C)/2;
        acirculo = C * C* pi;
        atrapezio = (A + B)*C/2;
        aquadrado = B*B;
        aretangulo = A*B;

        System.out.printf("TRIANGULO: %.3f\n",atriangulo);
        System.out.printf("CIRCULO: %.3f\n",acirculo);
        System.out.printf("TRAPEZIO: %.3f\n",atrapezio);
        System.out.printf("QUADRADO: %.3f\n",aquadrado);
        System.out.printf("RETANGULO: %.3f\n",aretangulo);
    }
}