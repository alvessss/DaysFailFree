package com.alvessss.daysfailfree;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

// TODO: extract calendar data from some API to fill the Calendar View

public class MainActivity extends AppCompatActivity {
   @Override
   protected void onCreate(Bundle savedInstanceState){
      super.onCreate(savedInstanceState);
      setContentView(R.layout.month_and_goals);
   }
}