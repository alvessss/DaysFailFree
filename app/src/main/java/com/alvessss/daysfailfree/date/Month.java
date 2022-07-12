package com.alvessss.daysfailfree.date;

import java.util.Calendar;

@SuppressWarnings("all")
public class Month {
   private final String name;
   private final int index;
   private final Day[] days;

   private int currentDay;

   private Month(String name, int index, Day[] days, int currentDay){
      this.name = name;
      this.index = index;
      this.days = days;
      this.currentDay = currentDay;
   }

   public static Month get(int IDIOM) {
      final Calendar calendar = Calendar.getInstance();
      final int currentDay = calendar.get(Calendar.DAY_OF_MONTH);
      final int currentMonth = calendar.get(Calendar.MONTH);
      final String currentName = CalendarNames.MONTH_NAMES[IDIOM][calendar.get(Calendar.MONTH) - 1];

      final Day[] days = new Day[calendar.getActualMaximum(Calendar.DAY_OF_MONTH)];
      for (int indexOfDay = 0; indexOfDay < days.length; indexOfDay++){
         calendar.set(Calendar.DAY_OF_MONTH, indexOfDay);
         days[indexOfDay] = new Day(CalendarNames.DAYS_NAMES[IDIOM][calendar.get(Calendar.DAY_OF_WEEK) - 1], indexOfDay + 1);
      }

      return new Month(currentName, currentMonth, days, currentDay);
   }

   public String getName(){
      return name;
   }

   public int getIndex(){
      return index;
   }

   public Day[] getDays(){
      return days;
   }

   public int getCurrentDay(){
      return currentDay;
   }
}
