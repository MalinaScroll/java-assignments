package com.company;

public class assignment1 {

    public static void main(String[] args) {
        //assignment 1.1
        System.out.println("Java is Object Georiënteerd");
        System.out.println("Java is strongly typed");
        System.out.println("Java is geen JavaScript\n");

        //assignment 1.2
        for (int i = 0; i < 5; i++) {
            System.out.println("Java is geweldig!");
        }
        System.out.println("\n");

        //assignment 1.3
        System.out.println("a   a^2  a^3  a^4 \n" + "1    1    1    1 \n" + "2    4    8    16 \n" + "3    9    27   81 \n" + "4    16   64   256\n");

        //assignment 1.4
        double som = (7.5 * 6.5 - 4.5 * 3) / (47.5 * 5.5);
        System.out.println(som + "\n");

        //assignment 1.5
        int counting = 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 +9 + 10;
        System.out.println(counting + "\n");

        //assignment 1.6
        double nearPi = 4 * (1 - 1.0 / 3 + 1.0 / 5 - 1.0 / 7 + 1.0 / 9 - 1.0 / 11 + 1.0 / 13);
        System.out.println(nearPi + "\n");

        // assignment 1.7
        double π = 3.14159;
        double straal = 6.5;
        double oppervlakte = straal * straal * π;
        double omtrek = 2 * straal * π;
        System.out.println("oppervlakte = " + oppervlakte + "\n" + "omtrek = " + omtrek + "\n");

        //assignment 1.8
        double lengte = 5.3;
        double breedte = 8.6;
        double oppervlakte2 = lengte * breedte;
        double omtrek2 = 2 * ( lengte + breedte);
        System.out.println("oppervlakte = " + oppervlakte2 + "\n" + "omtrek = " + omtrek2);

    }
}
