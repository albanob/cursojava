import java.util.Scanner;
public class Uri1142{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
    
        int N,contador, contador1, contador2;

        N  = teclado.nextInt();// quantidade de linhas
        //contador = contador + 1 // contador++ // contador+=1
        for (contador = 1; contador<N*4; contador = contador+4){ //x+=4
            contador1 = contador + 1;
            contador2 = contador1 + 1;
            System.out.println(contador+" "+contador1+" "+contador2+" PUM");
        }
        }
    }  
    