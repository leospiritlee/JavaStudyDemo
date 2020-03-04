package com.leospiritlee.base.time;

import java.time.Clock;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * @Project: JavaStudyDemo
 * @ClassName LocalDate
 * @description: TODO
 * @author: leospiritlee
 * @create: 2020-03-04 17:40
 **/
public class Jdk8TimeDemo {


    /**
     * LocalDate 测试 只包含日期
     */
    private static void localDateTest(){
        LocalDate today = LocalDate.now();
        System.out.println("当前日期:" + today);

        int year = today.getYear();
        int month = today.getMonth().getValue();
        int month_2 = today.getMonthValue();

        int dayM = today.getDayOfMonth();
        int dayW = today.getDayOfWeek().getValue();
        int dayY = today.getDayOfYear();

        System.out.println("year:" + year);
        System.out.println("month:" + month);
        System.out.println("month_2:" + month_2);

        System.out.println("dayM:" + dayM);
        System.out.println("dayW:" + dayW);
        System.out.println("dayY:" + dayY);


        LocalDate customizeDate = LocalDate.of(2020, 2, 29);
        System.out.println("自定义日期:" + customizeDate);

        if(today.equals(customizeDate)){
            System.out.println("时间与今天相等");
        }else {
            System.out.println("时间与今天不等");
        }

        LocalDate customizeDateToday = LocalDate.of(2020, 3, 4);
        System.out.println("自定义日期:" + customizeDateToday);

        if(today.equals(customizeDateToday)){
            System.out.println("时间与今天相等");
        }else {
            System.out.println("时间与今天不等");
        }


        MonthDay birthday = MonthDay.of(customizeDate.getMonth(), customizeDate.getDayOfMonth());
        MonthDay currentMonthDay = MonthDay.from(today);

        System.out.println("birthday: " + birthday);
        System.out.println("currentMonthDay: " + currentMonthDay);

        if(currentMonthDay.equals(birthday)){
            System.out.println("是你的生日");
        }else{
            System.out.println("你的生日还没有到");
        }


        LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
        System.out.println("一周后的日期为:"+nextWeek);

        LocalDate previousYear  = today.plus(-1 , ChronoUnit.YEARS);
        LocalDate previousYear_2 = today.minus(1, ChronoUnit.YEARS);
        System.out.println("一年前的日期 : " + previousYear);
        System.out.println("一年前的日期 : " + previousYear_2);
        LocalDate nextYear = today.plus(1, ChronoUnit.YEARS);
        System.out.println("一年后的日期 : "+ nextYear);


        LocalDate afterDate = today.plus(1, ChronoUnit.DAYS);
        if(afterDate.isAfter(today)){
            System.out.println("今天之后的日期: "+ afterDate);
        }

        LocalDate beforeDate = today.minus(1, ChronoUnit.DAYS);
        if(beforeDate.isBefore(today)){
            System.out.println("今天之前的日期: "+ beforeDate);
        }

        if(today.isLeapYear()) {
            System.out.printf("This year %d is Leap year %n", today.getYear());
        }else {
            System.out.printf("This year %d is Leap year  %n", today.getYear());
        }

        Period periodToNextJavaRelease  = Period.between(today, nextYear.plus(1, ChronoUnit.DAYS));
        System.out.println("periodToNextJavaRelease:" + periodToNextJavaRelease);
        System.out.println("periodToNextJavaRelease:" + periodToNextJavaRelease.toTotalMonths());
        System.out.println("periodToNextJavaRelease:" + toTotalDays(periodToNextJavaRelease));

        System.out.println("Years left between today and Java 8 release : "
                + periodToNextJavaRelease.getYears());
        System.out.println("Months left between today and Java 8 release : "
                + periodToNextJavaRelease.getMonths());
        System.out.println("Days left between today and Java 8 release : "
                + periodToNextJavaRelease.getDays());

        String dayAfterTomorrow = "20200305";
        LocalDate formatted = LocalDate.parse(dayAfterTomorrow, DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(dayAfterTomorrow+"  格式化后的日期为:  "+formatted);

        System.out.println("------------------------------------------------");



    }

    private static long toTotalDays(Period period){
        return period.getYears() * 365 + period.getMonths() * 30 + period.getDays();
    }


    /**
     *  LocalTime 测试 只包含时间
     */
    private static void localTimeTest(){
        LocalTime time = LocalTime.now();
        System.out.println("获取当前的时间,不含有日期:"+time);

        LocalTime newTime = time.plusHours(3);
        System.out.println("三个小时后的时间为:"+newTime);


        System.out.println("------------------------------------------------");
    }

    /**
     *  Clock 测试
     */
    private static void clockTest(){
        // Returns the current time based on your system clock and set to UTC.
        Clock clock = Clock.systemUTC();
        System.out.println("Clock : " + clock.millis());

        // Returns time based on system clock zone
        Clock defaultClock = Clock.systemDefaultZone();
        System.out.println("Clock : " + defaultClock.millis());



        System.out.println("------------------------------------------------");
    }

    /**
     * ZoneId  测试
     */
    private static void zoneIdTest(){
        ZoneId america = ZoneId.of("America/New_York");
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime americaTime = ZonedDateTime.of(localDateTime, america);
        System.out.println("Current date and time in a particular timezone : " + americaTime);

        ZoneId japan = ZoneId.of("Asia/Tokyo");
        ZonedDateTime japanTime = ZonedDateTime.now(japan);

        System.out.println("Current date and time in a particular timezone : " + japanTime);

        System.out.println("------------------------------------------------");
    }

    /**
     * YearMonth  测试
     */
    private static void yearMonthTest(){

        YearMonth currentYearMonth = YearMonth.now();
        System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        YearMonth creditCardExpiry = YearMonth.of(2019, Month.FEBRUARY);
        System.out.printf("Your credit card expires on %s %n", creditCardExpiry);

        System.out.println("------------------------------------------------");
    }

    /**
     * Instant 测试
     */
    private static void instantTest(){
        Instant timestamp = Instant.now();
        System.out.println("What is value of this instant " + timestamp.toEpochMilli());

        System.out.println("------------------------------------------------");
    }

    /**
     * LocalDateTime 测试
     */
    private static void localDateTimeTest(){
        LocalDateTime now = LocalDateTime.now();

        DateTimeFormatter dateTimeFormatter_1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        String nowFormatterString_1 = now.format(dateTimeFormatter_1);
        System.out.println("日期转换为字符串:" + nowFormatterString_1);

        DateTimeFormatter dateTimeFormatter_2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDate nowDate = LocalDate.parse(nowFormatterString_1, dateTimeFormatter_2);
        System.out.println("日期类型:" + nowDate);

        System.out.println("------------------------------------------------");
    }



    public static void main(String[] args) {
        Jdk8TimeDemo.localDateTest();
        Jdk8TimeDemo.localTimeTest();
        Jdk8TimeDemo.clockTest();
        Jdk8TimeDemo.zoneIdTest();
        Jdk8TimeDemo.yearMonthTest();
        Jdk8TimeDemo.instantTest();
        Jdk8TimeDemo.localDateTimeTest();
    }
}
