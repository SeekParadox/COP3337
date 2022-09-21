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
 * A class that formats decimal numbers to the clients specified base.
 * Implements NumberFormatter
 * @see assignment4.NumberFormatter
 */
public class BaseFormatter implements NumberFormatter{
    private final int base;

    /**
     * Constructs class that takes in the user specified base to later be converted
     * @param base stores current base number
     */
    public BaseFormatter(int base) {
        this.base = base;
    }

    /**
     * Takes in integer and converts it to this instance base
     *
     * @param n takes in number to be converted to base n format
     * @return decimal number converted to base n format
     * @see Integer
     */
    @Override
    public String format(int n) {
        return Integer.toString(n,base);
        }
}
