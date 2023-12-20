package HackerRank;
import java.util.*;

public class DifferenceInMatrix {
    public static void main(String[] args) {
        List<List<Integer>> matrix = new ArrayList<>();

        // Populate the matrix
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 1; j <= 3; j++) {
                row.add(i * 3 + j);
            }
            matrix.add(row);
        }

        // Print the matrix
        System.out.println("4x4 Matrix:");
        for (List<Integer> row : matrix) {
            for (Integer value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
        diagonalDifference(matrix);
    }
    public static int diagonalDifference(List<List<Integer>> arr) {
        // Write your code here
        int rightDiagonal = 0;
        int leftDiagonal = 0;
        for (int i = 0; i < arr.size(); i++){
            for (int j = 0; j < arr.size(); j++){
                if(i == j){
                    rightDiagonal = rightDiagonal + arr.get(i).get(j);
                    System.out.println("right");
                    System.out.println(arr.get(i).get(i));
                }
                if((i+j == arr.size()-1) && (j == arr.size()-1-i)){
                    leftDiagonal = leftDiagonal + arr.get(i).get(j);
                    System.out.println("left");
                    System.out.println(arr.get(i).get(j));
                }
            }
        }
        int difference = rightDiagonal - leftDiagonal;
        int answer = Math.abs(difference);
        return answer;
    }
}
