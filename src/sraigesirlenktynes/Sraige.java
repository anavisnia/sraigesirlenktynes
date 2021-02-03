package sraigesirlenktynes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Sraige extends Thread{
    static ArrayList<String> rezultatuListas1 = new ArrayList();
    ArrayList rezultatuListas;
    public String vardas;
    public int nueitasKelias;
    public final int Finisas = 100;

    public Sraige(String vardas, ArrayList<String> rezultatuListas) {
        this.vardas = vardas;
        this.rezultatuListas = rezultatuListas;
    }

    public void run() {
        Date d = new Date();
        System.out.println(this.vardas + " " + d.getTime());
        do {
            int ejimas = new Random().nextInt(5) + 1;
//        int ejimasSuMathR = (int) (Math.random() * 5 + 1);
            nueitasKelias += ejimas;
            if(this.nueitasKelias < Finisas) {
                System.out.println(this.vardas + ", nueiats kelias: " + nueitasKelias);
            } else {
                System.out.println("Finisas " + Finisas + " " + this.vardas);
//                Date c = new Date();
                long skirtumas = new Date().getTime() - d.getTime();
                synchronized (rezultatuListas1) {
                    rezultatuListas1.add(this.vardas + ", laikas: " + skirtumas); // tik vienas thread'as gali deti varda (vienu mietu)
                }
            }

            try {
                Thread.sleep(new Random().nextInt(5) + 1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } while(nueitasKelias < Finisas);

    }
}
