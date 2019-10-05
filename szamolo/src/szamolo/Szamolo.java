/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package szamolo;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Szamolo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("1.) összeadás\n2.) kivonás\n3.) szorzás\n4.) osztás\n");
        System.out.print("Melyik műveletet hajtsam végre? ");
        int op = sc.nextInt();
        if (op < 1 || op > 4)
            System.out.println("Hibás művelet.");
        else {
            System.out.print("Kérem az egyik számot: ");
            int a = sc.nextInt();
            System.out.print("Kérem a másik számot: ");
            int b = sc.nextInt();
            switch (op) {
                    case 1: System.out.println("Az eredmény: " + (a + b));
                    break;
                    case 2: System.out.println("Az eredmény: " + (a - b));
                    break;
                    case 3: System.out.println("Az eredmény: " + (a * b));
                    break;
                    case 4: {
                        if (b == 0)
                            System.out.println("Nullával való osztás.");
                                    else
                            System.out.println("Az eredmény: " + ((double) a / (double) b));}
                    break;
            
            }}
    }
    
}
