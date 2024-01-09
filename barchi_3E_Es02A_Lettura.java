import java.util.Scanner;
public class barchi_3E_Es02A_Lettura {
    public static void main(String[] args)
    {
        System.out.println("Lettura dei dati in java");
        Scanner keyboard=new Scanner(System.in);
        int datoint;
        double datodouble;
        byte datobyte;
        float datofloat;
        boolean datoboolean=true;
        char datochar;
        String datostring;

        datoint=keyboard.nextInt();
        System.out.println("Dato intero: "+datoint); //un dato intero è formato da 4 byte

        datodouble=keyboard.nextDouble();
        System.out.println("Dato Double: "+datodouble);//un dato double è formato da 8 byte

        datobyte=keyboard.nextByte();
        System.out.println("Dato Byte: "+datobyte);//un dato byte è formato da 1 byte

        datofloat=keyboard.nextFloat();
        System.out.println("Dato Float: "+datofloat);//un dato float è formato da 4 byte

        System.out.println("Dato Boolean: "+datoboolean);//un dato boolean è formato da 1 byte

        datochar=keyboard.next().charAt(0);//0 indica la posizione del carattere nella parola
        System.out.println("Dato Char: "+datochar);//un dato char è formato da 2 byte

        datostring=keyboard.nextLine();
        System.out.println("Dato Stringa: "+datostring);//un dato string è formato da
    }
}
