package ProgramsInClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AddingNumbersInArray {
    int input;
    int sum = 0;

    List<Integer> arr = new ArrayList<Integer>();
    List<Integer> list = new ArrayList<Integer>();

    Scanner inp = new Scanner(System.in);


    public static void main(String[] args) {
        AddingNumbersInArray obj = new AddingNumbersInArray();
        obj.getInput();
        obj.addingJumpingNumbers();
    }
    public void getInput(){
        System.out.println("Enter a number below 10: ");
        input = inp.nextInt();
        for (int i =1; i <= 10; i++){
            arr.add(i);
        }
    }
    public void addingJumpingNumbers(){
        for (int i = 0; i < arr.size(); i++) {
            if(i%input==0){
                list.add(arr.get(i));
                sum+=arr.get(i);
            }
        }
        System.out.println(sum);

        arr.clear();
        arr.addAll(list);
        System.out.println(arr);
        list.clear();

        while(sum > arr.size()){
            sum=0;
            addingJumpingNumbers();
        }
    }
}
