/* Inserire un numero intero che rappresenta i secondi trascorsi dall’inizio di oggi e mostra in
   uscita l’ora attuale espressa in hh:mm:ss (ore:minuti:secondi).
   Se l’utente inserisce un valore nullo o un valore superiore ad un giorno chiedere il
   reinserimento.
   Esempio 1:
   102(secondi) = 0(ore):1(minuto):42(secondi);
   Esempio 2:
   6662(secondi) = 1(ora):51(minuti):2(secondi) */
import java.util.Scanner;
public class barchi_3E_Es07A_Secondi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int num;
        int sec = 0;
        int min = 0;
        int ore = 0;

        do {
            System.out.println("Inserisci il numero di secondi");
            num = keyboard.nextInt();

            if(num > 86400)
                System.out.println("Errato! Hai inserito un valore maggiore di un giorno! Riprova.");
            else
                System.out.println("Errato! Hai inserito un valore negativo! Riprova.");
        }while(num < 0 || num > 86400);

        while (num >= 60) {
            num = num - 60;
            min++;
            while (min == 60){
                min = 0;
                ore++;
            }
        }

        sec = num;
        System.out.println(ore +"(ore):" +min +"(min):" +sec +"(sec)");

    }
}