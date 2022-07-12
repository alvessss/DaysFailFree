package com.alvessss.daysfailfree.date;

@SuppressWarnings("all")
public class CalendarNames {
   public static final int EN_US = 0;
   public static final int PT_BR = 1;

   public static final String[][]
      MONTH_NAMES = {
         {"JANUARY","FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"},               // EN-US
         {"JANEIRO", "FEVEREIRO", "MARÇO", "ABRIL", "MAIO", "JUNHO", "JULHO", "AGOSTO", "SETEMBRO", "OUTUBRO", "NOVEMBRO", "DEZEMBRO"}             // PT-BR
   };

   public static final String[][]
      DAYS_NAMES = {
         {"MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY"},                                                           // EN-US
         {"SEGUNDA", "TERÇA", "QUARTA", "QUINTA", "SEXTA", "SABADO", "DOMINGO"}                                                                    // PT-BR
   };
}