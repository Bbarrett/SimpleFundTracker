
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;

/**
 *
 * @author brandonbarrett
 */
public class Recorder {
    private Date date1;
    private File fundFile;
    private String writtenDate;
    private BufferedWriter myBw;
    

    public Recorder() throws IOException {
       fundFile = new File("/Users/brandonbarrett/fundRecordFile.txt");

       if (!fundFile.exists()) {
           fundFile.createNewFile();
         } else {
          System.out.println("File already exists.");
         }
    }

    public void createHeader() throws IOException {
        DateFormat thisDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        date1 = new Date();
        writtenDate = thisDateFormat.format(date1);
        myBw = new BufferedWriter(new FileWriter(fundFile, true));
        myBw.write(writtenDate);
        System.out.println("Header Created");
    }

    public void createFund(String todaysFund) throws IOException {
        myBw.write("/: " + todaysFund + " ,");

        myBw.close();
        System.out.println("Fund Created");
    }
  
    public Date getDate() {
        return date1;
    }

    public File getFundFile() {
        return fundFile;
    }
}
