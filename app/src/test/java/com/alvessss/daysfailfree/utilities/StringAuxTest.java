package com.alvessss.daysfailfree.utilities;

import org.junit.Test;
import static org.junit.Assert.*;
import static com.alvessss.daysfailfree.utilities.StringAux.allIndexesOf;
import static com.alvessss.daysfailfree.utilities.StringAux.capitalizeFirstLetter;
import static com.alvessss.daysfailfree.utilities.StringAux.countOccurrences;

public class StringAuxTest {
   @Test public void testCountOccurrences(){
      assertEquals(0, countOccurrences("D", "A, B, C"));
      assertEquals(1, countOccurrences("D", "A, B, C, D"));
      assertEquals(3, countOccurrences("D", "D, A, D, B, C, D"));
   }

   @Test public void testAllIndexesOf(){
      assertEquals(0, allIndexesOf("A", "A, B, C")[0]);
      assertEquals(3, allIndexesOf("B", "A, B, C")[0]);
      assertEquals(2, allIndexesOf("B", "A, B, C, B").length);
   }

   @Test public void testCapitalizeFirstLetter(){
      assertEquals("Vasco", capitalizeFirstLetter("vasco"));
      assertEquals(" Vasco", capitalizeFirstLetter(" vasco"));
      assertEquals(" Vasco ", capitalizeFirstLetter(" vasco "));
      assertEquals("Vasco Da Gama", capitalizeFirstLetter("vasco da gama"));
      assertEquals(" Vasco Da Gama ", capitalizeFirstLetter(" vasco da gama "));
      assertEquals("  Vasco Da Gama  A", capitalizeFirstLetter("  vasco da gama  a"));
      assertEquals("A ", capitalizeFirstLetter("a "));
      assertEquals(" A", capitalizeFirstLetter(" a"));
      assertEquals(" Aa Bb Cc Dd ", capitalizeFirstLetter(" aA bB cC dD "));
   }
}