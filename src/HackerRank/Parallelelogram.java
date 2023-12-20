package HackerRank;

import java.util.*;

public class Parallelelogram {
        //Write your code here
        static boolean flag = true;
        static int B,H;
        static{
            try{
                Scanner inp = new Scanner(System.in);
                B = inp.nextInt();
                H = inp.nextInt();
                if (B <= 0 || H <=0){
                    flag = false;
                    throw new Exception("java.lang.Exception: Breadth and height must be positive");
                }
                flag = true;
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        public static void main(String[] args){
            if(flag){
                int area=B*H;
                System.out.print(area);
            }
        }//end of main
}//end of class



