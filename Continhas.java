public class Continhas{
    public static void main(String args[]){
        int a, b, c;

        a = 10;
        b = 7;

        c = a + b;
        System.out.println("Valor da soma = " + c);

        c = a - b;
        System.out.println("Valor da sub = " + c);

        c = a * b;
        System.out.println("Valor da mult = " + c);

        c = a / b;
        System.out.println("Valor da div = " + c);

        c = a % b;
        System.out.println("Valor do rest = " + c);

        double x;
        x = 1.0/2;
        System.out.println("Valor do x = " + x);

        float y;
        y = 1.0f/3;
        System.out.printf("Valor do y = %.2f   - %.5f - %.3f\n",x,x,x);

        /* possíveis mascaras
        %f para valores reais (float ou double)
            %.2f -> vou mostrar o valor com 2 casas após o .
            valor 5.3333 --> "5.33"
            valor 1000 --> "1000.00"

            %8.2 -> vou mostrar o valor com 8 dígitos, sendo q 2 após o . (contando o.)
            valor 3.1234 --> "    3.12"
        */


    }
}