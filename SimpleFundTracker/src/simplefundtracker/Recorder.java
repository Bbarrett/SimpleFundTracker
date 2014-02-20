
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedWriter;
import java.io.File;
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
    private final File FUNDFILE;
    private String writtenDate;
    private BufferedWriter myBw;

    public Recorder() throws IOException {
        FUNDFILE = new File("/Users/brandonbarrett/fundFile.txt");

        if (!FUNDFILE.exists()) {
            FUNDFILE.createNewFile();
        } else {
            System.out.println("File already exists.");
        }
    }

    public void createHeader() throws IOException {
        DateFormat thisDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        date1 = new Date();
        writtenDate = thisDateFormat.format(date1);
        myBw = new BufferedWriter(new FileWriter(FUNDFILE, true));
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
        return FUNDFILE;
    }
}
