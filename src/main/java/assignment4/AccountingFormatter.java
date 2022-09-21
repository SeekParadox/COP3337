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
 * This class formats decimal numbers into account formatted numbers
 * @see assignment4.NumberFormatter
 *
 */
public class AccountingFormatter implements NumberFormatter{

    /**
     *
     * Formats number into account format
     * If the number is negative it will be converted into positive and surrounded by braces.
     * Example: -10 would then become (10)
     * @param n takes in number from client to be converted into Account format
     * @return n in account format
     */
    @Override
    public String format(int n) {
        return n < 0 ? "(" + Math.abs(n)+")" : Integer.toString(n);
    }
}
