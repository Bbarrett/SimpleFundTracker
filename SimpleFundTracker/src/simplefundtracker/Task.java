
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.File;
import java.io.IOException;

import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brandonbarrett
 */
public final class Task extends TimerTask {
    private Recorder  r;
    private Connector c;
    private String    todaysFund;

    public Task() throws IOException {}

    // Make it simple, create a task that can be set to run each day at noon.
    @Override
    public void run() {
        try {
            r = new Recorder();
            c = new Connector();
            c.findFund();
            r.createHeader();
            todaysFund = c.getfundElement();
            r.createFund(todaysFund);
        } catch (IOException ex) {
            Logger.getLogger(Task.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}



