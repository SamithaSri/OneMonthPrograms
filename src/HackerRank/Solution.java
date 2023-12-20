package HackerRank;

import java.util.Scanner;
import java.lang.*;

public class Solution {
    public static void main(String[] args) {
        Solution obj = new Solution();
        obj.convertingDatatypes();
    }
    public void convertingDatatypes() {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        String s = "" + n;
        if (n <= 100 && n >= -100) {
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            }
        }else {
            System.out.println("Wrong answer.");
        }

    }
}


