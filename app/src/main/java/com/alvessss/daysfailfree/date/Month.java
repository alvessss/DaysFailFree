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
      final int currentMonth = calendar.get(Calendar.MONTH) + 1;
      final String currentName = CalendarNames.MONTH_NAMES[IDIOM][calendar.get(Calendar.MONTH)];
      final Day[] days = new Day[calendar.getActualMaximum(Calendar.DAY_OF_MONTH)];

      String name;
      int index;
      int dayOfWeek;
      calendar.set(Calendar.DAY_OF_MONTH, 1);
      for (int indexOfDay = 0; indexOfDay < days.length; indexOfDay++){
         dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK) - 1;
         name = CalendarNames.DAYS_NAMES[IDIOM][dayOfWeek];
         index = indexOfDay + 1;
         days[indexOfDay] = new Day(name, index);
         calendar.add(Calendar.DAY_OF_MONTH, 1);
      }

      return new Month(currentName, currentMonth, days, currentDay);
   }

   @Override public String toString(){
      return String.format("%s (%d)", name.toUpperCase(), index);
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

   public Day getDay(int index){
      if (index < days.length){
         return days[index];
      }

      return null;
   }

   public int getCurrentDay(){
      return currentDay;
   }

   public boolean increaseCurrentDay(){
      if (currentDay < days.length){
         currentDay++;
         return true;
      }

      return false;
   }
}
