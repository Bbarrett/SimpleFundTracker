
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.File;
import java.io.IOException;


/**
 *
 * @author brandonbarrett
 */
public class SimpleFundTracker {
    private static File myFundFile;

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Recorder recorder = new Recorder();
        AverageCalculator Ac = new AverageCalculator();

         Task t = new Task();
         t.run();

        myFundFile = recorder.getFundFile();
        Ac.readFile(myFundFile);
    }
}



