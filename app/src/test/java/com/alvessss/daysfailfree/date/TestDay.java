package com.alvessss.daysfailfree.date;
import static org.junit.Assert.*;

import org.junit.Test;

public class TestDay {
   @Test public void testNameAndIndex(){
      Day day = new Day("Monday", 2);
      assertEquals(day.getName(), "Monday");
      assertEquals(day.getIndex(), 2);
      assertEquals(day.toString(), "Monday (2)");
   }
}
