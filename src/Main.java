import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Kund kund1 = new Kund("Karen", "650909-0000");
        Kund kund2 = new Kund("Lotta", "989898-0000");


        Anställd anställd1 = new Anställd("Gabriel", "19900707", 40_000);
        Anställd anställd2 = new Anställd("David", "19940204", 38_000);


       Konto konto1 = new Konto(300_000.0, 3.5, "E093KJ");
       Konto konto2 = new Konto(10_000, 3.5, "KJU34i");

       Lån lån1 = new Lån(400_000, 2.5, anställd1);
       Lån lån2 = new Lån(15_000, 2.5, anställd2);

       kund1.addKonton(konto1);
       kund1.addLån(lån2);
       kund2.addKonton(konto2);
       kund2.addLån(lån1);

        System.out.println(kund1.toString());
        System.out.println();
       //System.out.println(kund2.toString());
       // System.out.println();

    }
}