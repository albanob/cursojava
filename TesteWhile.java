import java.util.Scanner;
public class TesteWhile{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao;
        do{
            System.out.println("Digite 1 para deposito / 2 para saque / 3 para extrato / 0 para sair");
            opcao = teclado.nextInt();
        }
        while (opcao != 10);
    }
}