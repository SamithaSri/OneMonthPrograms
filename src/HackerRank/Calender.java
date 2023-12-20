package HackerRank;
import java.sql.*;

public class Calender {
    public static void main(String[] args) {
        Calender obj = new Calender();
        System.out.println(findDay(12,16,2023));
    }
    public static String findDay(int month,int day, int year) {
        int day1=0;
        String daystr = "";
        if (year > 2000 && year <3000){
            Date date = new Date(year-1900,month-1,day);
            day1 = date.getDay();
        }
        if(day1 == 0){
            daystr= "sunday";
        }else if(day1 == 1){
            daystr= "monday";
        }else if(day1 == 2){
            daystr= "tuesday";
        }else if(day1 == 3){
            daystr= "wednesday";
        }else if(day1 == 4){
            daystr= "thursday";
        }else if(day1 == 5){
            daystr= "friday";
        }else if(day1 == 6){
            daystr= "saturday";
        }
        return daystr.toUpperCase();
    }
}
