package ProgramsInClass;

import java.util.Scanner;

public class PatternPrinting {
    Scanner inp = new Scanner(System.in);
    public void invertedTriangle(){
        System.out.println("Enter the number: ");
        int num = inp.nextInt();
        for (int i = num; i > 0; i--){
            for (int j = 0; j <= num - i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        PatternPrinting obj = new PatternPrinting();
        obj.invertedTriangle();
    }
}
