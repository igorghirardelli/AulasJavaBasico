import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class String2 {
    public static void main(String[] args) {


        String nome = "igor";

        // ISO 8601

        LocalDate hoje = LocalDate.now();
        Locale brasil = new Locale("pt", "BR");
        //System.out.println(hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil));

        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();

        if (agora.getHour() >= 0 && agora.getHour() < 12) {
            saudacao = "bom dia";
        } else if (agora.getHour() >= 12 && agora.getHour() < 18) {
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24) {
            saudacao = "boa noite";
        }else {
            saudacao = "";
        }

        System.out.println("OLA "+nome+" Hoje é "+diaSemana+" "+saudacao);
    }
}