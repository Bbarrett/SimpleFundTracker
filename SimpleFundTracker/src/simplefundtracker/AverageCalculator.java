
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author brandonbarrett
 */
public class AverageCalculator {
    private BufferedReader mBr;
    private String line;
    private Double averageChange;

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
                Double d = Double.parseDouble(fundChangeArray[i]);

                averageChange += i / i;
                
            }
                System.out.println(averageChange);
        }
    }
}





