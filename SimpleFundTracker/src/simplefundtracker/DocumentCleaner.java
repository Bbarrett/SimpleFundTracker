package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author brandonbarrett
 */
public class DocumentCleaner extends Task {
    private BufferedReader fileBr;

    public DocumentCleaner() throws IOException {}

    @Override
    public void run() {}

    private void cleanDuplicateDates(File fundFile) throws IOException {
        fileBr = new BufferedReader(new FileReader(fundFile));

        String newLine   = fileBr.readLine();
        String[] lineArray = newLine.split("");
        Set tempSet   = new HashSet();

        for (String str : lineArray) {
        
            
        
        }
    }
}

