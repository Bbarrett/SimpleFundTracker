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
    private Double averageChange;
    private String line;

    public AverageCalculator() {}

    public void readFile(File FundFile) throws FileNotFoundException, IOException {
        BufferedReader mBr = new BufferedReader(new FileReader(FundFile));

        while ((line = mBr.readLine()) != null) {
            mBr.readLine();
        }
    }

    public Double calculateAverageChange() {
        String[] fundChangeArray = line.split(" ");

        for (int i = 1; i < fundChangeArray.length; i += 2) {
            Double d = Double.parseDouble(fundChangeArray[i]);

            averageChange += d / i / 2;

            DecimalFormat df = new DecimalFormat("#.##");
            df.format(d);
        }

        return averageChange;
    }

    public Double getAverageChange() {
        return averageChange;
    }
}



