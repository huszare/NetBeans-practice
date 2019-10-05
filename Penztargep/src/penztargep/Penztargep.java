/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penztargep;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Penztargep {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Pénztárgép program. Kérem a tételeket, a vége 0.");
        int max = 1;
        int sum = 0;
        int be = -1;
        int n = 0;
        int olcsoDb = 0;
        while (be != 0) {
            be = sc.nextInt();
            sum += be;
            n++; 
            if (be > max)
                max = be;
            if (be < 500)
                olcsoDb++;
        }
         
        double atlag = (double) sum / (double) (n-1);
        double szaz = (max-atlag)/(atlag)*100;
        System.out.printf("Összesen %d Ft.%n", sum);
        System.out.printf("Átlag %.2f Ft.%n", atlag);
        System.out.printf("Legdrágább %d Ft.%n", max); 
        System.out.printf("A legdrágább %.2f%%-kal volt drágább az átlagnál.%n", szaz);
        System.out.printf("Összesen %d db. 500 Ft-nál olcsóbb termék volt az áruk közt.%n", olcsoDb-1);
    }
    
}
