package elements;

import java.util.Scanner;

public class URLScanner {
    private final Scanner SC = new Scanner(System.in);
    private String fundCode;

    public URLScanner() {}

    public void setURL() {
        System.out.println("Enter your four letter fund code.");
        fundCode = SC.next();
    }

    public String getURL() {
        return fundCode;
    }
}



