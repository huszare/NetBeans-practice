/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tombtombbekerekit;
import java.util.Scanner;
/**
 *
 * @author
 */
public class TombTombbeKerekit {
public static int round (int a){
        int kerek;
        int marad = a % 10;
        if (marad < 3) 
            kerek = a - marad;
        else {
            if (marad > 7) 
                kerek = a - marad +10;
        else
            kerek = a - marad +5;}
        return kerek;
    }
public static void roundSelf(int[] numbers) {
    for (int i = 0; i < numbers.length; i++)
        numbers [i] = round(numbers [i]);
    return;
}
public static int[] roundNew (int[] numbers) {
    int[] newArray = new int[numbers.length];
    for (int i = 0; i < numbers.length; i++)
        newArray [i] = round(numbers [i]);
     return newArray;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kérem az összegek számát: ");
        int n = sc.nextInt();
        int[] ma = new int[n]; 
        System.out.println("Kérem az összegeket:");
        for (int i = 0; i < n; i++)
            ma [i] = sc.nextInt();
        System.out.println("Kerekítve:");
        //roundSelf(ma);
        ma = roundNew(ma);
        for (int i = 0; i < n; i++)
            System.out.println(ma[i]);;
    }
    
}
