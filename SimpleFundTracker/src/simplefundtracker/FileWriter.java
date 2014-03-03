/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplefundtracker;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author brandonbarrett
 */
public class FileWriter extends FileCreator {
    
    private BufferedWriter myBw;
    
    public FileWriter() throws IOException{}
    
    
    public void createHeader(File FUND_FILE) throws IOException {
        DateFormat thisDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = new Date();
        String  writtenDate = thisDateFormat.format(date1);
        myBw = new BufferedWriter(new java.io.FileWriter(FUND_FILE, true));
        myBw.write(writtenDate);
        
    }

    public void createFund(String todaysFund) throws IOException {
        myBw.write("/: " + todaysFund + " ,");

        myBw.close();
        
}
}