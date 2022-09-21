package assignment4;
/**
 * <h1>
 *  Title:           Assignment 4
 *  <br>
 *  <h2>
 *  Semester:        COP3337 – Summer 2022
 *  <br>
 *  @author          Michael Waller
 *
 *  <p>I affirm that this program is entirely my own work
 *  and none of it is the work of any other person.</p>
 *  <br>
 *
 * This class formats decimal numbers with a comma between every three numbers following the hundreds place
 */
public class DecimalSeparatorFormatter implements NumberFormatter {
    /**
     *
     * @param n takes in the number to be formatted
     * @return n in decimal separator format
     */
    @Override
    public String format(int n) {
        boolean isNeg = n < 0;
        //stores the absolute value of the number in reverse order
        StringBuilder number  = new StringBuilder(Integer.toString(Math.abs(n))).reverse();
        //used to copy and append comma's to n
        StringBuilder formatted = new StringBuilder();
       for(int i = 0; i < number.length(); i++) {
           //checks the current index is divisible by three and appends a comma
           if(i != 0 && i % 3 == 0) formatted.append(",");
           formatted.append(number.charAt(i));
       }
       number = new StringBuilder(formatted.toString()).reverse(); //reverts the string to
        //if the number was previously negative the sign will be reinserted at index 0
       if(isNeg) number.insert(0,'-');

       return number.toString();
    }
}
