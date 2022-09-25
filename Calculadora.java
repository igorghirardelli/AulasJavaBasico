import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double n1,n2;

        System.out.println("Calculadora java");

        System.out.println("Informe o primeiro numero ");
        n1 = teclado.nextDouble();

        System.out.println("Informe o segundo numero");
        n2 = teclado.nextDouble();

        System.out.println("Selecione a operação");
        System.out.println("[1] - Soma ");
        System.out.println("[2] - Subtrair ");
        System.out.println("[3] - Multiplicação ");
        System.out.println("[4] - Divisão ");
        System.out.println(">>>>>>>>>>>>>> Digite sua opção");
        byte op = teclado.nextByte();

        double result = 0;

        switch (op){
            case 1 : result = n1 +n2; break;
            case 2 : result = n1 - n2;break;
            case 3: result =  n1 * n2;break;
            case 4: result = n1 / n2;break;
            default:
                System.out.println("Operação invalida"); break;
        }
        System.out.println("Primeiro numero : "+n1);
        System.out.println("Segundo numero : "+n2);
        System.out.println("O resultado é: "+result);

    }
}
