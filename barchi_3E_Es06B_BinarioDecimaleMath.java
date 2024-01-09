import java.util.Scanner;

public class barchi_3E_Es06B_BinarioDecimaleMath {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        String numeroBinario = ""; // input
        double numeroDecimale = 0; // output

        // variabili di calcolo
        double carattere = 0;
        double potenza = 1;
        boolean flagBinario = true;

        System.out.println("Conversione numero binario in numero decimale\n");

        // Acquisisco numero binario
        System.out.println("Inserisci un numero binario: ");
        numeroBinario = keyboard.next();

        // sto dentro al ciclo fino a quando non arrivo alla fine del numero
        for (int i = numeroBinario.length(); i > 0 && flagBinario; i--) {

            carattere = (double)numeroBinario.charAt(i - 1) - 48;

            // Controllo se il carattere é 0 o 1
            // Se si allora calcolo il numero
            if (numeroBinario.charAt(i - 1) == '1' || numeroBinario.charAt(i - 1) == '0') {
                // FORMULA: numeroDecimale = numeroDecimale + (int)char * 2**pow
                // numeroDecimale = numeroDecimale + carattere * Math.pow(2.0, pow);
                // pow++;

                // 0 =               0         +   1        * 2 * 0
                // 0 =              1        +     0       * 2 * 1
                // 0 =               1          +   1      * 2 * 2
                numeroDecimale = numeroDecimale + carattere * potenza;
                potenza = potenza * 2;
            }
            else {
                flagBinario = false;
            }
        }

        // se il numero é valido allora stampo il risultato
        if (flagBinario)
            System.out.println(numeroDecimale);
        else
            System.out.println("Numero non valido");
    }
}