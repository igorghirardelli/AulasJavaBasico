public class Boolean {
    public static void main(String[] args) {
    boolean fds = true; // Fim De Semana
    boolean fs  = true; // Fazendo sol
    boolean VamosAPraia = fds && fs;


        //Tabela verdade
        // Operador && (and)
        //true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        // Operador ||  (OR)
        //true || true = true
        // true || false = true
        // false || true = true
        // false || false = false

        // OPERADOR
        //true && true = true
        // true && false = false
        // false && true = false
        // false && false = false

        String mensagem = fds ? "É fim de semana " : "Não é fim de semana ";

        System.out.println(mensagem);
    }
}
