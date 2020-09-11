import java.util.Scanner;
public class Uri2787{
    public static void main(String args[]){
    
        Scanner teclado = new Scanner(System.in);

        int L, C;

        L = teclado.nextInt();
        C = teclado.nextInt();

        if ( (L%2==0) && (C%2 ==0)) {
            System.out.println("1");
        }
        else if ( (L%2==0) && (C%2 !=0)) {
            System.out.println("0");
        }
        else if ( (L%2!=0) && (C%2 !=0)) {
            System.out.println("1");
        }
        else if ( (L%2!=0) && (C%2 ==0)) {
            System.out.println("0");
        }

        } 
    }
    
