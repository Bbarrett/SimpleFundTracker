package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.text.DecimalFormat;

/**
 *
 * @author brandonbarrett
 */
public class AverageCalculator {
    private BufferedReader mBr;
    private String line;
    private Double averageChange;
    private Double d;
    
    public AverageCalculator() {
        averageChange = 0.0;
    }

    public void readFile(File FundFile) throws FileNotFoundException, IOException {

        // Read file
        mBr = new BufferedReader(new FileReader(FundFile));

        while ((line = mBr.readLine()) != null) {
            mBr.readLine();
           String[] fundChangeArray = line.split(" ");

            // Get average of fund change amount (stored in array at odd intervals)
            for (int i = 1; i < fundChangeArray.length; i += 2) {
                d             = Double.parseDouble(fundChangeArray[i]);
                averageChange += d / i / 2;
            }

            // Format average as a Double
            DecimalFormat df = new DecimalFormat("#.##");

            System.out.println(df.format(averageChange));
        }
    }

    public Double getAverageChange() {
        return averageChange;
    }
}



