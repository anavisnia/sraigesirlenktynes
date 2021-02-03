package sraigesirlenktynes;

import java.util.ArrayList;
import java.util.List;

public class Sraigeslenktynes {

    public static void main(String[] args) throws InterruptedException {
	    /*
        Sraige sliauzia 100 cm
        sliauzimas: pamiega random nuo 1 iki 5 mili sek
        pasliauzia random nuo 1 iki 5 cm
        po 10 20 30...cm spausdina  "sraige 1 nusliauze 11cm(tiek kiek tuo metu bus)"
        sukam cikla
        sraige turi sliauzti 100 cm (do while)

        mainas turi 8 sraiges
        turi paliesti visas sraiges sliauzti
        sulaukti kol baigs visos sraiges
        atspauzdinti turnirine lentele
        */
        ArrayList<String> rezultatai = new ArrayList();

        Sraige s1 = new Sraige("Lava", rezultatai);
        Sraige s2 = new Sraige("Akuo", rezultatai);
        Sraige s3 = new Sraige("Pasa", rezultatai);
        Sraige s4 = new Sraige("Cu", rezultatai);
        Sraige s5 = new Sraige("We" ,rezultatai);
        Sraige s6 = new Sraige("Bak", rezultatai);
        Sraige s7 = new Sraige("Nusa", rezultatai);
        Sraige s8 = new Sraige("Uppa", rezultatai);

        s1.start();
        s2.start();
        s3.start();
        s4.start();
        s5.start();
        s6.start();
        s7.start();
        s8.start();

        s1.join();
        s2.join();
        s3.join();
        s4.join();
        s5.join();
        s6.join();
        s7.join();
        s8.join();

        System.out.println("-----------Rezultato lentele--------------");
//        for (int i = 0; i < rezultatai.size(); i++) {
//            int j = i + 1;
//            System.out.println("Vieta " + j + ": " + rezultatai.get(i));
//        }
        // static ArrayList
        for (int i = 0; i < Sraige.rezultatuListas1.size(); i++) {
            int j = i + 1;
            System.out.println("Vieta " + j + ": " + Sraige.rezultatuListas1.get(i));
        }
    }
}