package tasks;

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



