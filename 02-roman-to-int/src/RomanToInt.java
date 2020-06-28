import java.util.HashMap;
import java.util.Map;
/**
 * https://webrewrite.com/convert-roman-numeral-to-integer-value/
 *
 */
public class RomanToInt {
	public static int convertRomanToInteger(String str) {
		 
	      //If string value is null or zero
	       if(str == null || str.length() == 0) {
	           return 0;
	       }
	 
	       //Create a mapping of roman numerals and it's integer value
	       Map<Character, Integer> charMap = new HashMap<>();
	       charMap.put('I', 1);
	       charMap.put('V', 5);
	       charMap.put('X', 10);
	       charMap.put('L', 50);
	       charMap.put('C', 100);
	       charMap.put('D', 500);
	       charMap.put('M', 1000);
	 
	       int result = 0;
	 
	       /*
	         Traverse a string and pick each character at a time.
	       */
	       for(int i = 0; i < str.length()-1; i++) {
	 
	             /*
	               If current Roman numeral value is greater than
	               then the next value, the do addition.
	             */
	             if(charMap.get(str.charAt(i)) >= charMap.get(str.charAt(i+1))) {
	                result = result + charMap.get(str.charAt(i));
	              } else {
	                result = result - charMap.get(str.charAt(i));
	              } 
	        }
	 
	         //Add the value of last numeral
	         result = result + charMap.get(str.charAt(str.length()-1));
	 
	        return result;
	   }
	 
	 
	    public static void main(String[] args) {
	 
	        //String str = "IV";
	        //String str = "XXIV";
	          String str = "XC";
	 
	          int result = convertRomanToInteger(str);
	          System.out.println(result);
	      }

}
