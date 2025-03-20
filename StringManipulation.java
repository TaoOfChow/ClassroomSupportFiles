import java.util.Scanner;

class StringManipulation {

  //This method returns the length of the String, st
	public static int getLength(String st) {
		return st.length();
	}

  //This method returns the number of times a char, ch,  appears in the String, st
  public static int letterCount(String st, char ch){
    int count = 0;
    for(int x = 0; x < st. length(); x++)
      if(st.charAt(x) == ch)
        count++;

    return count;
  }

  //This method returns the reverse of the String, st
  public static String reverse(String st) {
		String word = "";
     for(int x = st. length()-1; x >= 0 ; x--)
       word += st.charAt(x);
    return word;
	}

  //This method returns true if st1 and st2 are anagrams of each other.
  //If they are not anagrams, it returns false
  //The method is case sensitive 
  public static boolean isAnagram(String st1, String st2){
    char[] s1 = st1.toCharArray();
    char[] s2 = st2.toCharArray();
    boolean letterFound = false;
    
    for(int x = 0; x < s1.length; x++)
      {
        letterFound = false;
        for(int y = 0; y < s2.length; y++){
          if(s1[x] == s2[y]){
            s2[y] = '~';
            letterFound = true;
            break;
          }
          
        }
        if(!letterFound)
          return false;
      }
    return true;
    
  }

  /*This method will return the pig latin version of a word.  The pig latin   
    version of a word is found by moving the first letter of the word to the
    end of the word and then adding "ay" to it.

  Example: Robin = obinRay;
  Example: Raven = avenRay
  Example: Cyborg = yborgCay;
  */
  public static String pigLatin(String st) {
    
    return st.substring(1) + st.charAt(0) + "ay";
  }


  /*This method will remove all duplicate characters from a String so that it
  is only made of unique characters.  You can assume all characters in the String
  will have ASCII values between 32 and 126 (inclusive)

  Sample Input:
    banana
  Sample Output:
    ban
  */
  
  public static String removeDuplicates(String st) {
      String word = "";
      int[] letterCount = new int[127];

      for(int x = 0; x < st.length(); x++)
        if(letterCount[st.charAt(x)]++ == 0)
          word+=st.charAt(x);
    return word;
  }

  /*The following method takes a string of 1's and 0's and compresses it by 
  making a new string in the following way:
    1. The new string will start with the first character (either 1 or 0) in the 
        string
    2. The next character will be a number showing how many of that digit appeared 
        in a row before the opposite digit appeared.
    3. The next character will be a number showing how many of the opposite digit
        appeared in a row before the first digit appeared again.
    4. Go to step 2 and keep repeating until the whole string is compressed.

Sample input:  111111111111000000001111111110000110001111000
Sample output: 1 12 8 9 4 2 3 4 3

  */
  public static String compression(String st) {
    String word = "" + st.charAt(0);
    char currentChar = st.charAt(0);
    int count = 1;

    for(int x = 1; x < st.length(); x++){
      if(st.charAt(x) == currentChar)
        count++;
      else{
        word += " " + count;
        count = 1;
        currentChar = st.charAt(x);
      }
    }
  word += " " + count;
    return word;
    
  }
    
  

  /////////////////////////////////////////
	//DO NOT EDIT ANY CODE BELOW THIS LINE!//
	/////////////////////////////////////////
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int testNumber = input.nextInt();

    if(testNumber == 1){
      String st = input.next();
      System.out.println( getLength(st) );
    }
    else if(testNumber == 2){
      String st = input.next();
      System.out.println( letterCount(st, 'p'));
      System.out.println( letterCount(st, 'b'));
      System.out.println( letterCount(st, 'a'));
    }
    else if(testNumber == 3){
        String st = input.next();
        System.out.println( reverse(st) );
    }
    else if(testNumber == 4){
        String s1 = input.next();
        String s2 = input.next();
        System.out.println( isAnagram(s1, s2) );
    }
    else if(testNumber == 5){
        String st = input.next();
        System.out.println( pigLatin(st) );
    }
    else if (testNumber == 6){
        String st = input.next();
        System.out.println( removeDuplicates(st) );
    }
    else if(testNumber == 7){
        String st = input.next();
      System.out.println( compression(st) );
    }
    

    
  
  }
}
  
