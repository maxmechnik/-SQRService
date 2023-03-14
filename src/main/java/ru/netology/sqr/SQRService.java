package ru.netology.sqr;


public class SQRService {

    public static int raschetDiap(int nachalo, int konec) {

        int skolkoPopalo = 0;

        for (int chislo = 10; chislo <= 99; chislo++) {

            int kvadrat = chislo * chislo;
            if (kvadrat >= nachalo && kvadrat <= konec)
                skolkoPopalo++;

        }
        return skolkoPopalo;
    }
}
