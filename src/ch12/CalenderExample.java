package ch12;

import java.util.Calendar;
import java.util.Date;

public class CalenderExample {
    public static void main(String[] args){
        Calendar calendar = Calendar.getInstance();

        System.out.println("현재 시각: "+calendar.getTime());
        calendar.set(2024,Calendar.AUGUST,15);
        System.out.println("설정된 날짜: "+calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 7);
        System.out.println("7일 후: "+calendar.getTime());

        calendar.add(Calendar.MONTH,-1);
        System.out.println("1개월 전: "+calendar.getTime());

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("현재 생성된 날짜: "+year+"년 "+month+"월 "+day+"일");

        Date date = calendar.getTime();
        System.out.println("Date 객체: "+date);
    }
}
