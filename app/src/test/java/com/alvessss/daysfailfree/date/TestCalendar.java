package com.alvessss.daysfailfree.date;

import org.junit.Test;

public class TestCalendar {
   @Test public void checkWeekDayInEnglish(){
      java.util.Calendar javaCalendar = java.util.Calendar.getInstance();
      final int weekDay = javaCalendar.get(java.util.Calendar.DAY_OF_WEEK);
      final String weekDayName = Calendar.getNameOfCurrentDay(Calendar.EN_US).toUpperCase();
      assert weekDay > 0;
      switch (weekDay) {
         case 1: assert weekDayName.equals("MONDAY"); break;
         case 2: assert weekDayName.equals("TUESDAY"); break;
         case 3: assert weekDayName.equals("WEDNESDAY"); break;
         case 4: assert weekDayName.equals("THURSDAY"); break;
         case 5: assert weekDayName.equals("FRIDAY"); break;
         case 6: assert weekDayName.equals("SATURDAY"); break;
         case 7: assert weekDayName.equals("SUNDAY"); break;
      }
   }

   @Test public void checkMonthInEnglish(){
      java.util.Calendar javaCalendar = java.util.Calendar.getInstance();
      final int month = javaCalendar.get(java.util.Calendar.MONTH);
      final String monthName = Calendar.getNameOfCurrentMonth(Calendar.EN_US).toUpperCase();
      assert month > 0;
      switch (month) {
         case  1: assert monthName.equals("JANUARY"); break;
         case  2: assert monthName.equals("FEBRUARY"); break;
         case  3: assert monthName.equals("MARCH"); break;
         case  4: assert monthName.equals("APRIL"); break;
         case  5: assert monthName.equals("MAY"); break;
         case  6: assert monthName.equals("JUNE"); break;
         case  7: assert monthName.equals("JULY"); break;
         case  8: assert monthName.equals("AUGUST"); break;
         case  9: assert monthName.equals("SEPTEMBER"); break;
         case 10: assert monthName.equals("OCTOBER"); break;
         case 11: assert monthName.equals("NOVEMBER"); break;
         case 12: assert monthName.equals("DECEMBER"); break;
      }
   }

   @Test public void checkRangeOfWeekDay(){
      final int weekDay = Calendar.getCurrentDay();
      assert weekDay > 0 && weekDay <= 7;
   }

   @Test public void checkRangeOfMonth(){
      final int month = Calendar.getCurrentMonth();
      assert month > 0 && month <= 12;
   }
}
