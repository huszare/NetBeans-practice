/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homerseklet;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Homerseklet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double napiKozep = 0;
        double hetiAtlag = 0;
        int meleg = 0;
        int maxNapi = 0;
        int maxNap = 1;
        boolean min = false;
        for (int i = 1; i <= 7; i++) {
            System.out.printf("Kérem a(z) %d. nap középhőmérsékletét: ", i);
            int kozep = sc.nextInt();
            hetiAtlag += kozep;
            if (kozep < 0)
                min = true;
            if (kozep > 25)
                meleg++;
            if (i == 1)
                maxNapi = kozep;
            else {
                if (kozep > maxNapi) {
                maxNapi = kozep;
                maxNap = i;
            }}
         }
        if (min)
            System.out.printf("Volt 0 fok alatti középhőmérsékletű nap.%n");
        else
            System.out.printf("Nem volt 0 fok alatti középhőmérsékletű nap.%n");
        System.out.printf("A heti átlaghőmérséklet %.2f fok volt.%n", hetiAtlag/7);
        System.out.printf("A héten %d olyan nap volt, amikor 25 foknál melegebb volt.%n", meleg);
        System.out.printf("A legmelegebb nap a(z) %d. volt, amikor %d fok volt.%n", maxNap, maxNapi); 
    }
    
}
