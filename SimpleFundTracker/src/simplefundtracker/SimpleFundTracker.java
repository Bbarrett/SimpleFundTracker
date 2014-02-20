
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

/**
 *
 * @author brandonbarrett
 */
public class SimpleFundTracker {
    static File myFundFile;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        AverageCalculator Ac = new AverageCalculator();
        Recorder r  = new Recorder();
        
        myFundFile = r.getFundFile();
        Ac.readFile(myFundFile);
        
    }
}



