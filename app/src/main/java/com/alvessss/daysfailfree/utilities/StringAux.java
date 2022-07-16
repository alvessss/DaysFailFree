package com.alvessss.daysfailfree.utilities;

@SuppressWarnings("all")
public final class StringAux {
   private static final String BLANK_SPACE = " ";
   private static final String EMPTY = "";

   private static final int FIRST_LETTER = 0;
   private static final int NOT_FOUND = -1;

   public static String capitalizeFirstLetter(String originalString){
      int[] blankSpacesIndexes = allIndexesOf(BLANK_SPACE, originalString);
      String lowerCaseString = originalString.toLowerCase();
      StringBuilder capitalizedStringBuilder = new StringBuilder(lowerCaseString);
      if (blankSpacesIndexes.length == 0){
         if (lowerCaseString.length() > 1){
            String lowerCaseSubstring = lowerCaseString.substring(1, lowerCaseString.length());
            String upperCaseFirstLetter = lowerCaseString.substring(0, 1).toUpperCase();
            return upperCaseFirstLetter + lowerCaseSubstring;
         } else {
            return lowerCaseString.toUpperCase();
         }
      } else {
         // capitalize first letter anyway
         capitalizedStringBuilder.setCharAt(0,
            String.valueOf(lowerCaseString.charAt(0)).toUpperCase().charAt(0));
         // capitalize the right-adjacent of the blank spaces
         for (int index = 0; index < blankSpacesIndexes.length; index++){
            if ((blankSpacesIndexes[index] + 1) == lowerCaseString.length()) {
               continue;
            }
            capitalizedStringBuilder.setCharAt(blankSpacesIndexes[index] + 1,
               String.valueOf(lowerCaseString.charAt(blankSpacesIndexes[index] + 1)).toUpperCase().charAt(0));
         }
         return capitalizedStringBuilder.toString();
      }
   }

   public static int[] allIndexesOf(String targetChar, String targetString){
      int countOfOcurrences = countOccurrences(targetChar, targetString);
      int[] arrayOfIndexes = new int[countOfOcurrences];
      int size = 0;
      for (int stringIndex = 0; stringIndex < targetString.length(); stringIndex++){
         if (String.valueOf(targetString.charAt(stringIndex)).equals(targetChar)){
            arrayOfIndexes[size++] = stringIndex;
         }
      }

      return arrayOfIndexes;
   }

   public static int countOccurrences(String targetChar, String targetString){
      int countOfOcurrences = 0;
      for (int stringIndex = 0; stringIndex < targetString.length(); stringIndex++){
         if (String.valueOf(targetString.charAt(stringIndex)).equals(targetChar))
            countOfOcurrences++;
      }
      return countOfOcurrences;
   }
}
