
package tasks;

import elements.Connector;
import elements.FileCreator;
import elements.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brandonbarrett
 */
public class UpdateFile {
    public UpdateFile() throws IOException {}

    public void runTask(Connector c) {
        try {
            FileCreator fc = new FileCreator();
            File fundFile = fc.getFundFile();
            FileWriter  fw = new FileWriter();

            fw.createHeader(fundFile);

            String todaysFund = c.getFundElement();

            fw.createFund(todaysFund);
        } catch (IOException ex) {
            Logger.getLogger(UpdateFile.class.getName()).log(Level.SEVERE, "File creation failed", ex);
        }
    }
}



