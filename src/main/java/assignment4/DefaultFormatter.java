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
 * A class that formats a number into a String
 * @see assignment4.NumberFormatter
 */
public class DefaultFormatter implements NumberFormatter{

    /**
     *
     * @param n takes in the number to be formatted
     * @return formats integer to String value of the current number
     */
    @Override
    public String format(int n) {
        return String.valueOf(n);
    }
}
