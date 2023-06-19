package day05;

import java.util.Calendar;

public class Ex02_ImportCalendar {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int mon = cal.get(Calendar.MONTH) + 1;
        // 0월 부터 반환하므로 1을 더하여 사용
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int min = cal.get(Calendar.MINUTE);
        int sec = cal.get(Calendar.SECOND);
        System.out.println("현재 시간");
        System.out.println (year + "년 " + mon + "월 " + day + "일");
        System.out.println (hour + "시 " + min + "분 " + sec + "초");
    }   }
