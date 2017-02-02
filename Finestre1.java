/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finestre1;
import java.util.Scanner;
/**
 *
 * @author studente_2
 */
public class Finestre1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Finestra f;
        int x, num;
        
        do{
            System.out.println("inserire numero di finestre che si vuole aprire");
            num = input.nextInt();
        }while((num<0)||(num>100));
        for(x=0;x<num;x++){
            f = new Finestra();
            f.setVisible(true);
            f.testo.setText("sono la finestra "+ (x+1));
            f.setLocation((150+x*40),(150+x*40));
            f.setTitle("finestra" + (x+1));
        }
    }
}
