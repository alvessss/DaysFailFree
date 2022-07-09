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
}
