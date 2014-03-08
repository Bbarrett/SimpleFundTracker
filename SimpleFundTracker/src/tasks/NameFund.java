
package tasks;


import elements.URLScanner;

import java.util.TimerTask;

/**
 *
 * @author brandonbarrett
 */
public class NameFund extends TimerTask {
    public NameFund() {}

    @Override
    public void run() {
        URLScanner URL_SCAN = new URLScanner();

        URL_SCAN.setURL();
        URL_SCAN.getURL();
    }
}



