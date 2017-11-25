import java.util.Scanner;

public class Email_verifier_JZ55233 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String adres;

        System.out.println("Enter email adress: ");
        adres = scan.nextLine();

        char malpa = '@';
        int malpapozycja = adres.indexOf(malpa);
        char kropka = '.';
        int kropkapozycja = adres.indexOf(kropka);
        int kropazprawej = adres.indexOf(kropkapozycja, malpapozycja);



                   if (adres.length() <= 5 || adres.length() >= 264 || (adres.indexOf(malpa) <= 2) ||
                           (adres.startsWith("@")) || (adres.startsWith(".")) || (adres.endsWith("@")) ||
                           (kropkapozycja == malpapozycja + 1) || (kropazprawej != -1))
                   {

                                System.out.println("bad address, try again");}

                    else{
                       System.out.println("good address");
                            }

    }
}


