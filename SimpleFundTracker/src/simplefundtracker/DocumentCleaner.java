package simplefundtracker;

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

    private void cleanDuplicateDates(File fundFile, String Date) throws IOException {
        fileBr = new BufferedReader(new FileReader(fundFile));

        String   newLine   = fileBr.readLine();
        String[] lineArray = newLine.split("");
        Set testSet   = new HashSet();

        for (String str : lineArray) {
            if (!testSet.add(Date)) {
                System.out.println("Date is already accounted for.");
            }
        }
    }
}



