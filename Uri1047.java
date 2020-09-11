import java.util.Scanner;
public class Uri1047{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);

        int horai,horaimin, horaf,horafmin,minentrada,minfinal; 
        int mini, minf, r1, r2, temp, temp2, hora, minuto;

        horai = teclado.nextInt();
        mini  = teclado.nextInt();
        horaf = teclado.nextInt();
        minf  = teclado.nextInt();
        
        horaimin = horai*60;
        horafmin = horaf*60;

        minentrada = horaimin + mini;
        minfinal   = horafmin + minf;
        r1 = minfinal - minentrada;

        if (r1 > 0){
            hora = r1/60;
            minuto = r1 - hora*60;
            System.out.print("O JOGO DUROU "+hora);
            System.out.print(" HORA(S) E "+minuto);
            System.out.println(" MINUTO(S)");
        }
        else if (r1 == 0){
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        }
        else if (r1 < 0){
            temp = r1+1440;
            hora = temp/60;
            minuto = temp - hora*60;
            System.out.print("O JOGO DUROU "+hora);
            System.out.print(" HORA(S) E "+minuto);
            System.out.println(" MINUTO(S)");
        }
    }     
}
