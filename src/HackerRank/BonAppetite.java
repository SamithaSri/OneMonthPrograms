package HackerRank;

import java.util.*;

public class BonAppetite {
    public static void bonAppetit(List<Integer> bill, int k, int b) {
        int total = 0;
        bill.set(k,0);
        for (int i = 0; i < bill.size(); i++){
            total += bill.get(i);
        }

        int given = total / 2;

        if (given == b){
            System.out.println("Bon Appetite");
        }
        else {
            int refund = b - given;
            System.out.println("refund: " + refund);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(2);
        arrList.add(7);
        arrList.add(3);
        bonAppetit(arrList,2,14);
    }

}

