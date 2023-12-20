package ProgramsInClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SeparatingTheNumbers {
    List<Integer> list = new ArrayList<Integer>();

    public static void main(String[] args) {
        SeparatingTheNumbers obj = new SeparatingTheNumbers();
        obj.numbersGame();
    }
    public void numbersGame(){
        for (int i = 0; i <= 100; i++){
            if (i > 9) {
                while (i < 100) {
                    int firstDigit =  i / 10;
                    int secondDigit = i % 10;
                    int sum = firstDigit + secondDigit;
                    if (sum > 9) {
                        int firstDigitOfSum = sum / 10;
                        int secondDigitOfSum = sum % 10;
                        int reverse = secondDigitOfSum + firstDigitOfSum;
                        int multiple = sum * reverse;
                        if (i == multiple) {
                            list.add(i);
                        }
                    }

                    int reverse = sum;
                    int multiple = sum * reverse;
                    if (i == multiple){
                        list.add(i);
                    }
                    break;
                }
            }
            else if (i <= 9){
                if (i == i*i) {
                    list.add(i);
                }
            }
        }
        System.out.println(list);
    }
}
