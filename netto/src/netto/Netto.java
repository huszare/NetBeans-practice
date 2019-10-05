/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package netto;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Netto {
public static double netPrice (double gross, int vatPercent) {
      double netto = 100*gross/(100+vatPercent);  
      return netto;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a bruttó árat: ");
        double brutto = sc.nextDouble();
        System.out.print("Kérem az ÁFA-kulcsot: ");
        int afa = sc.nextInt();
        double netto = netPrice(brutto, afa);
        System.out.printf("Nettó ár: %.2f\n", netto);
    }
    
}
