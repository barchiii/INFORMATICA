// Programma che chiede quanti bottiglioni acquistare
// ne calcola il costo
// calcola l'iva
// calcola il costo finale
// restituendo lo scontrino dell'acquisto.

import java.util.Scanner;
public class barchi_3E_Es03B_Vinaio {
    public static void main(String[] args)
    {
        Scanner keyboard=new Scanner(System.in);

        int bottiglioni;
        double capacita = 1.5;
        double costoLitro = 1.0;
        double costoTot;
        double iva;
        double totP;
        double tot = 0;
        String risposta=""; //inizializzo una stringa vuota
        int clienti=0;

        do
        {
            do
            {
                System.out.println("Quanti bottiglioni vuoi acquistare?");
                bottiglioni = keyboard.nextInt();

            } while(bottiglioni <= 0); //controllo inserimento valore bottiglini
            costoTot = bottiglioni * capacita * costoLitro;
            iva = costoTot * 0.21;
            totP = costoTot + iva;
            clienti = clienti + 1;
            tot = tot + totP;

            System.out.println("Numero di bottiglioni acquistati: " +bottiglioni);
            System.out.println("Numero di clienti: "+clienti);
            System.out.println("Prezzo di vendita senza IVA: " +costoTot +"€");
            System.out.println("Iva 21% applicata: " +iva +"€");
            System.out.println("-----------------------");
            System.out.println("Prezzo finale: " +totP +"€");

            System.out.println("C'è un altro cliente? (S/N)");
            risposta = keyboard.nextLine().toUpperCase();//cosi svuota i dati precedenti
            risposta = keyboard.nextLine().toUpperCase();//sennò si scrive solo next

            System.out.println("Il prezzo finale è: "+tot);

        } while(risposta.equals("S"));

        System.out.println("Fine programma");
    }
}