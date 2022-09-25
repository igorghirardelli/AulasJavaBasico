import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1,n2,media;

        System.out.println("Informe sua primeira nota");
        n1 = teclado.nextDouble();

        System.out.println("Informe sua segunda nota ");
        n2 = teclado.nextDouble();

        media = (n1+n2)/2;

        System.out.println("Sua media final é: "+media);
    }
}
