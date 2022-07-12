package com.alvessss.daysfailfree.date;

import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

public class TestMonth extends Assert {
   @Test
   public void checkMonthNames(){
      Month currentMonth = Month.get(CalendarNames.EN_US);
      switch (currentMonth.getIndex()) {
         case   1: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][0]); break;
         case   2: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][1]); break;
         case   3: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][2]); break;
         case   4: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][3]); break;
         case   5: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][4]); break;
         case   6: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][5]); break;
         case   7: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][6]); break;
         case   8: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][7]); break;
         case   9: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][8]); break;
         case  10: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][9]); break;
         case  11: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][10]); break;
         case  12: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[CalendarNames.EN_US][11]); break;
      }
   }

   @Test
   public void checkWeekDaysNames(){
      Month currentMonth = Month.get(CalendarNames.EN_US);
      Calendar calendar = Calendar.getInstance();

      String nameOfCurrentDay = CalendarNames.DAYS_NAMES[CalendarNames.EN_US][calendar.get(Calendar.DAY_OF_WEEK) - 1];
      int currentday = Arrays.asList(CalendarNames.DAYS_NAMES[CalendarNames.EN_US]).indexOf(nameOfCurrentDay);
   }
}
