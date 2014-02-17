/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplefundtracker;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author brandonbarrett
 */
public class FundCalculator {
    
 private BufferedReader mBr;
 private String line;
 private Double convertedFund;

 public FundCalculator(){
     
 }

 public void readFile(File FundFile) throws FileNotFoundException, IOException{
    mBr = new BufferedReader(new FileReader(FundFile));
              while ((line = mBr.readLine()) != null){
                      mBr.readLine();
                      String[] fundLine = line.split(" ");
                      System.out.println(fundLine[1]);
                      System.out.println(fundLine[3]);
 }
  
 }
}

