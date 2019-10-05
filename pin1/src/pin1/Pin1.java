/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pin1;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Pin1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pin = 1111;
        while (pin != 5936) {
            System.out.print("PIN: ");
            pin = sc.nextInt();
            if (pin != 5936)
            System.out.println("Hibás PIN.");
             }
        System.out.println("Titkos információ");
    }
    
}
