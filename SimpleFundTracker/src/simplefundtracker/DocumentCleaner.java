package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brandonbarrett
 */
public class DocumentCleaner extends Task {
    private BufferedReader fileBr;

    public DocumentCleaner() throws IOException {}

    @Override
    public void run() {
        try {
            Recorder r = new Recorder();
            File fundFile = r.getFundFile();
            String Date = r.getDate().toString();

            cleanDuplicateDates(fundFile, Date);
        } catch (IOException ex) {
            Logger.getLogger(DocumentCleaner.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cleanDuplicateDates(File fundFile, String Date) throws IOException {
        fileBr = new BufferedReader(new FileReader(fundFile));

        String   newLine   = fileBr.readLine();
        String[] lineArray = newLine.split("");
        Set      testSet   = new HashSet();

        for (String str : lineArray) {
            if (!testSet.add(Date)) {
                System.out.println("Date is already accounted for.");
            }
        }
    }
}


