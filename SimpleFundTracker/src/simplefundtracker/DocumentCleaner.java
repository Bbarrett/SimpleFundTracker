/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplefundtracker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

/**
 *
 * @author brandonbarrett
 */
public class DocumentCleaner extends Recorder {
    
    /**
     *
     * @throws java.io.IOException
     */
  
 
  
  private Recorder myRecorder = new Recorder();
    private File fileToCheck;
    private Date dateToCheck;
    
    public DocumentCleaner() throws IOException{
    //Initialize these bad boys...
    fileToCheck = myRecorder.getFundFile();
    dateToCheck = myRecorder.getDate();
   
       
    }
  public void cleanDocument(File fileToCheck, Date dateToCheck) throws FileNotFoundException, IOException{
    BufferedReader myBr = new BufferedReader(new FileReader(fileToCheck));
    BufferedWriter myBw = new BufferedWriter(new FileWriter(fileToCheck, true));
    String fileLine;
    
    while ((fileLine = myBr.readLine()) != null) {
            myBr.readLine();

            
    

}
