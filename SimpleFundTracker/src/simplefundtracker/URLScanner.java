
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.util.Scanner;

/**
 *
 * @author brandonbarrett
 */
public class URLScanner {
    Scanner sc = new Scanner(System.in);
    private String fundCode;

    public URLScanner() {}

    public void setURL() {
        System.out.println("Enter your four letter fund code.");
        fundCode = sc.next();
    }

    public String getURL() {
        return fundCode;
    }
}



