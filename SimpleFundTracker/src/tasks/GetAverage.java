
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package tasks;

//~--- non-JDK imports --------------------------------------------------------

import elements.AverageCalculator;
import elements.Connector;
import elements.FileCreator;
import java.io.File;
import java.io.IOException;
import java.util.TimerTask;

/**
 *
 * @author brandonbarrett
 */
public abstract class GetAverage extends TimerTask {
    public void runAverage(FileCreator fc) throws IOException {
        AverageCalculator ac = new AverageCalculator();
        File fundFile = fc.getFundFile();

        ac.readFile(fundFile);
        ac.calculateAverageChange();
    }
}



