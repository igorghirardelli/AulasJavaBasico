import java.sql.SQLOutput;

public class LacosNumericos {
    public static void main(String[] args) {
    // exibir numeros de 1 a 10
        int par = 0,impar = 1;

        for(int i =0; i<=101; i++){


            if(i %2 == 0){
                System.out.print("Numeros pares = " +i);

            } else{
                System.out.println(" Numeros impares = " +i);
            }


        }

    }
}
