/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pin2;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Pin2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1111;
        int i = 1;
        while (i < 4 && pin != 5936) {
            System.out.print("PIN: ");
            pin = sc.nextInt();
            i++;
            if (pin != 5936) {
            System.out.println("Hibás PIN.");
            }
            else {
            System.out.println("Titkos információ");
            i = 5; }
             }
        if (i == 4)
        System.out.println("Nincs több próbálkozási lehetőség!");
    }
    
}
