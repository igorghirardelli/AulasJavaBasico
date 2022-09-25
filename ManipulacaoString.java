import java.util.Locale;
import java.util.Scanner;

public class ManipulacaoString {
    public static void main(String[] args) {
        // ola (nome), hoje é (dia semana), bom dia

        Scanner teclado = new Scanner(System.in);

        String nome = "igor";

        System.out.println(nome.toUpperCase()); // converter letras maiusculas
        System.out.println(nome.toLowerCase()); // converter letras minusculas
        System.out.println(nome.length()); // A quantidade de caracteres
        String nomeOutro = "igor";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));






    }
}
