package com.alvessss.daysfailfree.calendar;

import androidx.appcompat.app.AppCompatActivity;

public class Column {
   public static Column MONDAY;
   public static Column TUESDAY;
   public static Column WEDNESDAY;
   public static Column THURSDAY;
   public static Column FRIDAY;
   public static Column SATURDAY;
   public static Column SUNDAY;

   public static void getResourcesFrom(AppCompatActivity appCompatActivity){
      final int[][] DAY_PLACES_INDEXES = {
         {0,  7, 14, 21, 28}, // MONDAY
         {1,  8, 15, 22, 29},
         {2,  9, 16, 23, 30},
         {3, 10, 17, 24, 31},
         {4, 11, 18, 25, 32},
         {5, 12, 19, 26, 33},
         {6, 13, 20, 25, 34}, // SUNDAY
      };
      MONDAY = new Column("MONDAY");
      TUESDAY = new Column("TUESDAY");
      WEDNESDAY = new Column("WEDNESDAY");
      THURSDAY = new Column("THURSDAY");
      FRIDAY = new Column("FRIDAY");
      SATURDAY = new Column("SATURDAY");
      SUNDAY = new Column("SUNDAY");
      for (int index = 0; index < 5; index++){
         MONDAY.dayPlaces[index] =    DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[0][index], appCompatActivity);
         TUESDAY.dayPlaces[index] =   DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[1][index], appCompatActivity);
         WEDNESDAY.dayPlaces[index] = DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[2][index], appCompatActivity);
         THURSDAY.dayPlaces[index] =  DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[3][index], appCompatActivity);
         FRIDAY.dayPlaces[index] =    DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[4][index], appCompatActivity);
         SATURDAY.dayPlaces[index] =  DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[5][index], appCompatActivity);
         SUNDAY.dayPlaces[index] =    DayPlace.getByPlaceIndex(DAY_PLACES_INDEXES[6][index], appCompatActivity);
      }
   }

   private final String name;
   private final DayPlace[] dayPlaces = new DayPlace[5];
   private int dayPlaceCurrentVacancy = 0;

   private Column(String name){ this.name = name; }
   public String getName(){ return name; }

   public void add(int numberOfDay){
      if (dayPlaceCurrentVacancy < dayPlaces.length){
         dayPlaces[dayPlaceCurrentVacancy].setNumberValue(numberOfDay);
         dayPlaceCurrentVacancy++;
      }
   }
}