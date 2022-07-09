package com.alvessss.daysfailfree.date;

// using java.util.Calendar

@SuppressWarnings("all")
public class Calendar {
   /*
      That class is-like a interface that will provide all we need about Date in this app
    */

   private static final java.util.Calendar
      javaCalendar = java.util.Calendar.getInstance();

   // Supported languages so far
   public static final int EN_US = 0;
   public static final int PT_BR = 1;
   //

   private static final String[][]
      MONTH_NAMES = {
         {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"},               // EN-US
         {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"}             // PT-BR
   };

   private static final String[][]
      DAYS_NAMES = {
         {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"},                                                           // EN-US
         {"SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO"}                                                                    // PT-BR
   };

   public static String getNameOfCurrentDay(int IDIOM){
      return DAYS_NAMES[IDIOM][getCurrentDay()];
   }

   public static String getNameOfCurrentMonth(int IDIOM){
      return MONTH_NAMES[IDIOM][getCurrentMonth()];
   }

   public static int getCurrentDay(){
      return javaCalendar.get(java.util.Calendar.DAY_OF_WEEK);
   }

   public static int getCurrentMonth(){
      return javaCalendar.get(java.util.Calendar.MONTH);
   }
}