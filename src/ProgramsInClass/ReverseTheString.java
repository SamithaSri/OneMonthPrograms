package ProgramsInClass;

import java.util.*;
import java.lang.*;

public class ReverseTheString {
    Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        ReverseTheString obj = new ReverseTheString();
//        obj.reverseStringUsingArrayList();
        obj.reverseStringUsingArray();
    }
    public void reverseStringUsingArray(){
        System.out.print("Enter the String: ");
        String str = scan.nextLine();
        String[] wordArr = str.split(" ");
        String arr = Arrays.toString(wordArr);
        System.out.println(arr);
        List<Character>  p =Arrays.asList('!',',','.','&');
        String [] temp = new String[wordArr.length];
        char [] temp1 = new char[wordArr.length];
        for(int i= wordArr.length-1,j=0; i>=0; i--, j++){
            String s=wordArr[i];
            char lastChar= s.charAt(s.length()-1);
//            System.out.println(p.contains(lastChar));
            if(p.contains(lastChar)){
                temp[j] =s.substring(0,s.length()-1);
                System.out.println("temp: " + temp[j]);
                temp1[i]=  lastChar;
                System.out.println("temp1: " + temp1[i]);
                continue;
            }
            temp[j] = wordArr[i];
            System.out.println("temp Array: " + temp[j]);
            System.out.println("word array: " + wordArr[i]);
        }
        for (int i=0;i<temp.length;i++) {
            String s = temp[i];
            if (p.contains(temp1[i])) {
                System.out.print(s + temp1[i] + " ");
                continue;
            }
            System.out.print(s + " ");
        }
    }

}
