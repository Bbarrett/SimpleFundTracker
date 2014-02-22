package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brandonbarrett
 */
public final class Task extends TimerTask {
    private Recorder r;
    private Connector c;
    private String todaysFund;
    private final URLScanner URLSC;

    public Task() throws IOException {
        URLSC = new URLScanner();
        URLSC.setURL();
    }

    // Make it simple, create a task that can be set to run each day at noon.
    @Override
    public void run() {
        try {
            r = new Recorder();
            c = new Connector();

            String fundURL = URLSC.getURL();

            c.findFund(fundURL);
            r.createHeader();
            todaysFund = c.getfundElement();
            r.createFund(todaysFund);
        } catch (IOException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



