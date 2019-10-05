/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vezeto;

import java.util.Scanner;
/**
 *
 * @author
 */
public class Vezeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Hány éves? ");
        int kor = sc.nextInt();
        if (kor >= 17)
            System.out.println("Vezethet autót.");
        else
            System.out.println("Nem vezethet autót.");
    }
    
}
