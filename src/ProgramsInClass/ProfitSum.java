package ProgramsInClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProfitSum {
    List<Integer> arr = new ArrayList<Integer>();
    Scanner inp = new Scanner(System.in);
    int num;
    public void getInput(){
        for(int i = 0; i< 6; i++){
            System.out.println("Enter any number: ");
            num = inp.nextInt();
            arr.add(num);
        }
        System.out.println(arr);
    }
    public void calculateProfit(){
        int profit = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j =i+1; j < arr.size(); j++){
                int difference = arr.get(j) - arr.get(i);
                if (profit < difference){
                    profit = difference;
                }
            }
        }
        System.out.println(profit);
    }

    public static void main(String[] args) {
        ProfitSum obj = new ProfitSum();
        obj.getInput();
        obj.calculateProfit();
    }

}
