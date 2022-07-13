package com.alvessss.daysfailfree.date;

@SuppressWarnings("all")
public class Day {
   private final String name;
   private final int index;

   public Day(String name, int index){
      this.name = name;
      this.index = index;
   }

   public String getName(){
      return name;
   }

   public int getIndex(){
      return index;
   }
}
