import java.util.Scanner;
public class VariasLeituras{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int codigo;
        String strCodigo, strPreco;
        String nome;
        float preco;

        System.out.println("Digite o codigo do produto");
        strCodigo = teclado.nextLine();
        codigo  = Integer.parseInt(strCodigo);
        System.out.println("Digite o nome do produto");
        nome  = teclado.nextLine();
        System.out.println("Digite o preco do produto");
        strPreco = teclado.nextLine();
        preco  = Float.parseFloat(strPreco);

        System.out.println("Produto cadastrado: "+codigo+"/"+nome+"/R$"+preco);
        }
    }

