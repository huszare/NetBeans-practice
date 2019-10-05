/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elojel;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Elojel {
public static int sign (int a){
        int sign = 0;
        if (a > 0)
            sign = 1;
        if(a < 0)
            sign = -1;
        return sign;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem a számot: ");
        int a = sc.nextInt();
        if (sign(a)>0)
            System.out.println("A szám signuma: +" + sign(a));
        else
            System.out.println("A szám signuma: " + sign(a));
    }
    
}
