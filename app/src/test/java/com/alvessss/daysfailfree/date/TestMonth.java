package com.alvessss.daysfailfree.date;

import static com.alvessss.daysfailfree.date.CalendarNames.EN_US;
import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Calendar;

public class TestMonth {
   @Test
   public void checkMonthNames(){
      Month currentMonth = Month.get(EN_US);
      switch (currentMonth.getIndex()) {
         case   1: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][0]); break;
         case   2: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][1]); break;
         case   3: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][2]); break;
         case   4: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][3]); break;
         case   5: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][4]); break;
         case   6: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][5]); break;
         case   7: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][6]); break;
         case   8: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][7]); break;
         case   9: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][8]); break;
         case  10: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][9]); break;
         case  11: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][10]); break;
         case  12: assertEquals(currentMonth.getName().toUpperCase(), CalendarNames.MONTH_NAMES[EN_US][11]); break;
      }
   }

   @Test
   public void checkWeekDaysNames(){
      Month currentMonth = Month.get(EN_US);
      Calendar calendar = Calendar.getInstance();

      final int dayOfMonth = currentMonth.getCurrentDay();
      final int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
      final int maxDays = currentMonth.getDays().length;

      for (int dom = dayOfMonth, dow = dayOfWeek; dom <= maxDays; dom++, dow++){
         if (dow == 8){
            dow = 1;
         }
         assertEquals(currentMonth.getDays()[dom - 1].getIndex(), dom);
         assertEquals(currentMonth.getDays()[dom - 1].getName(), CalendarNames.DAYS_NAMES[EN_US][dow - 1]);
      }
   }
}
