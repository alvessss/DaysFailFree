package com.alvessss.daysfailfree.calendar;

import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.alvessss.daysfailfree.R;

public class DayPlace {
   private static final int MAX_PLACE_NUMBER = 35;
   private static final int MIN_PLACE_NUMBER = 0;
   private static final int[] textViewsForDays = {
      R.id.day_one, R.id.day_two, R.id.day_three, R.id.day_four, R.id.day_five,
      R.id.day_six, R.id.day_seven, R.id.day_eight, R.id.day_nine, R.id.day_teen,
      R.id.day_eleven, R.id.day_twelve, R.id.day_thirteen, R.id.day_fourteen, R.id.day_fifteen,
      R.id.day_sixteen, R.id.day_seventeen, R.id.day_eighteen, R.id.day_nineteen, R.id.day_twenty,
      R.id.day_one, R.id.day_two, R.id.day_three, R.id.day_four, R.id.day_five,
      R.id.day_six, R.id.day_seven,R.id.day_eight, R.id.day_nine, R.id.day_thirteen,
      R.id.day_thirty_one, R.id.day_thirty_two, R.id.day_thirty_three, R.id.day_four, R.id.day_five
   };

   private final TextView textView;
   private final int indexValue;
   private int numberValue;

   private DayPlace(int indexValue, TextView textView){
      this.textView = textView;
      this.indexValue = indexValue;
   }

   public static DayPlace getByPlaceIndex(int placeIndex, AppCompatActivity activity){
      if (placeIndex < MAX_PLACE_NUMBER && placeIndex >= MIN_PLACE_NUMBER){
         final DayPlace instance = new DayPlace(placeIndex, activity.findViewById(textViewsForDays[placeIndex]));
         if (instance.textView != null){
            return instance;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   public int getIndexValue(){
      return indexValue;
   }

   public int getNumberValue(){
      return numberValue;
   }

   public void setNumberValue(int numberValue){
      this.numberValue = numberValue;
      this.textView.setText(String.valueOf(numberValue));
   }
}
