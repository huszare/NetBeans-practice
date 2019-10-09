/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tornasz2;

import java.util.Scanner;

/**
 *
 * @author
 */
public class Tornasz2 {

    public static void makeStep(String[] row, int stepNumber) {
        System.out.println("Lépésszám: " + stepNumber);
        System.out.println("------------------");
        System.out.println("|" + row[0] + "|" + row[1] + "|" + row[2] + "|" + row[3] + "|" + row[4] + "|" + row[5] + "|" + row[6] + "|" + row[7] + "|" + row[8] + "|");
        System.out.println("------------------");
    }

    public static int getValidStep(Scanner sc, String[] row, int stepNumber) {
        //int [] step = new int [2];
        boolean validStep = true;
        int startField = 4;
        int targetField = 0;
        int validTarget;
        while (validStep) {
            System.out.println("Melyik mezővel lépsz? (0-8)");
            startField = sc.nextInt();
            if (startField == -1) {
                stepNumber = -1;
                return stepNumber; }
            System.out.println("Melyik mezőre lépsz? (0-8)");
            targetField = sc.nextInt();
             if (targetField == -1) {
                stepNumber = -1;
                return stepNumber; }
            validTarget = (getValidTarget(row));
            if (validTarget != targetField) {
                System.out.println("Érvénytelen lépés!");
                validStep = true;}
                else
                if (getValidStart ( row, validTarget, startField)) 
                    validStep = false;
                else {
                    System.out.println("Érvénytelen lépés!");
                    validStep = true;}
                
        }
         if (row [startField] == "x")
            row[targetField] = "x";
         else 
            row[targetField] = "o";
         row[startField] = " ";
         stepNumber++;
        return stepNumber ;
}

public static int getValidTarget (String[] row)  {
    int validTarget =0;
    for (int i = 0; i < 9; i++) {
        if (row [i] == " ")
        validTarget = i; }
    return validTarget;
}
        
public static boolean getValidStart (String[] row, int validTarget, int startField)  {
    boolean validStart = false;
    if ((startField == (validTarget - 1)) || ((startField == (validTarget + 1)))) {
       validStart = true; 
       return validStart;
    }
    if (startField == (validTarget - 2))
       if (row[startField] != row[startField + 1]) {
        validStart = true;  
        return validStart;
       }
    if (startField == (validTarget + 2))
       if (row[startField] != row[startField - 1]) {
        validStart = true;  
        return validStart;
       } 
    return validStart;
}
        
public static boolean checkWinner(String[] row) {
        boolean end = true;
        String[] endRow = {"o", "o", "o", "o", " ", "x", "x", "x", "x"};
        int i = 0;
        while (end && i <9)
            if (row[i] == endRow[i])
                i++;
            else {
            end = false;
        return end; }
        System.out.println("Gratulálok, vége a játéknak!");
        return end;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stepNumber = 0;
        int step;
        boolean end;
        String[] row = {"x", "x", "x", "x", " ", "o", "o", "o", "o"};
        makeStep(row, stepNumber);
        do {
            stepNumber = getValidStep(sc, row, stepNumber);
            if (stepNumber == -1)
                end = true;
            else {
            makeStep(row, stepNumber);
            end = checkWinner(row);}
        } while (!end);

    }

}