/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meteo;
import java.util.Scanner;
/**
 *
 * @author
 */
public class Meteo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] meteo = {{23,24,25,23,22,16,19},{18,18,19,18,17,18,20},{24,24,25,24,23,20,20},{30,31,33,34,29,24,29}};
        //int[][] meteo = {{18,18,19,18,17,18,20},{23,24,25,23,22,35,19},{24,24,25,24,23,20,35},{30,31,33,34,29,24,29}};
        int n = sc.nextInt();
        int[][] meteo = new int[n][7]; 
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 7; j++)
                meteo[i][j] = sc.nextInt();
        int hoMax = meteo[0][0];
        int va = 1;
        int nap = 1;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < 7; j++) {
                if (meteo[i][j] >= hoMax) {
                    hoMax = meteo[i][j];
                    va = i + 1;
                    nap = j + 1;            
            }}
        System.out.println(va +" "+ nap +" "+ hoMax);
        double atlag;
        double minAtlag = 1000.0;
        va = 1;
        for (int i = 0; i < n; i++) {
            atlag = 0;
            for (int j = 0; j < 7; j++) {
                atlag += (double) meteo[i][j];
            }
             atlag = atlag / 7.0;    
            if (atlag < minAtlag) {
                minAtlag = atlag;
                va = i + 1;
        }}
        System.out.println(va);
        nap = 1;
        double maxAtlag = -300.0;
        for (int i = 0; i < 7; i++) {
            atlag = 0;
            for (int j = 0; j < n; j++) {
                atlag += (double) meteo[j][i];}
            //atlag = atlag / (double) n;    
            if (atlag >= maxAtlag) {
                maxAtlag = atlag;
                nap = i + 1;
        }}
        System.out.println(nap);
        int cs = meteo[0][0] - meteo[0][1];
        int maxcs = meteo[0][0] - meteo[0][1];
        va = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                cs = meteo[i][j] - meteo[i][j+1];
            if (cs > maxcs) {
                maxcs = cs;
                va = i + 1;}
        }}
        System.out.println(va + " " + maxcs);
    }
    
}
