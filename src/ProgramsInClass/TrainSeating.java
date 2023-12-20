package ProgramsInClass;

import java.util.Scanner;

public class TrainSeating {
    Scanner scan = new Scanner(System.in);
    int num;
    int[][] arr = new int[][]{
            {6,5,4,3,2,1},
            {7,8,9,10,11,12},
            {18,17,16,15,14,13},
            {19,20,21,22,23,24},
            {30,29,28,27,26,25}
    };
    public static void main(String[] args) {
        TrainSeating obj = new TrainSeating();
        obj.seating();
    }
    public void seating(){
        while (true) {
            System.out.print("Enter the number: ");
            num = scan.nextInt();
            int len = arr.length;
            if (num == 0){
                System.exit(0);
            }
            else if (num > 30){
                System.out.println("There is no seat for this number in the Bus\n");
            }
            for (int i = 0; i < len; i++) {
                int length = arr[i].length;
                for (int j = 0; j < length; j++) {
                    if (j == 0 || j == 5) {
                        if (arr[i][j] == num) {
                            System.out.println("It is a Window seat\n");
                            break;
                        }
                    } else if (j == 1 || j == 4) {
                        if (arr[i][j] == num) {
                            System.out.println("It is a Middle seat\n");
                            break;
                        }
                    } else if (j == 2 || j == 3) {
                        if (arr[i][j] == num) {
                            System.out.println("It is a Aisle seat\n");
                            break;
                        }
                    }
                }
            }
        }
    }

}
