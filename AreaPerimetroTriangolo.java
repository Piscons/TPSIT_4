package areaperimetrotriangolo;

import java.util.Scanner;

public class AreaPerimetroTriangolo {

    public static void main(String[] args) {
        float base, lato1, lato2, perimetro, area, altezza;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserisci base");
            base = input.nextFloat();
        } while (base <= 0);
        do {
            System.out.println("Inserisci il lato 1");
            lato1 = input.nextFloat();
        } while (lato1 <= 0);
        do {
            System.out.println("Inserisci il lato 2");
            lato2 = input.nextFloat();
        } while (lato2 <= 0);
        do {
            System.out.println("Inserisci altezza");
            altezza = input.nextFloat();
        } while (altezza <= 0);
        perimetro = base + lato1 + lato2;
        area = (base*altezza)/2;
        System.out.println("Il perimetro è : " +perimetro);
        System.out.println("l'area è : " +area);
        
       
        
    }

}
