/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg12_01_001;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Diak jozsi = new Diak();
        jozsi.nev = "Nagy Jozsef";
        jozsi.szuletesiEv = 1999;
        jozsi.atlag = 4.5;
        jozsi.kiir();
        Scanner sc = new Scanner(System.in);
        Diak beolvasottDiak = new Diak();
        beolvasottDiak.beolvas(sc);
        beolvasottDiak.kiir();
    }
    
}
