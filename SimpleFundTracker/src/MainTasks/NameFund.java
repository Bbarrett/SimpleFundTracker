
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package MainTasks;

//~--- non-JDK imports --------------------------------------------------------

import simplefundtracker.URLScanner;

//~--- JDK imports ------------------------------------------------------------

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



