/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retta;

/**
 *
 * @author studente
 */
public class Classe {

    public double a, b, c;

    public Classe(double x, double y, double noto) {
        this.a = x;
        this.b = y;
        this.c = noto;
    }

    public String getTipo() {
        if ((a != 0) && (b != 0)) {
            return "la retta è obliqua";
        }
        if ((a != 0) && (b == 0)) {
            return "la rettta è orizzontale";
        } else {
            return "la retta è verticale";
        }
    }

    public boolean Appartiene(double x, double y) {
        if ((this.a * x) + (this.b * y) + (this.c) ==0){
        return true;
    }
        return false;
    }
   

    public String stampa() {
        return (a + "x +" + b + " y +" + c + "= 0");
    }
}
