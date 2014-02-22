/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simplefundtracker;

import java.util.Scanner;

/**
 *
 * @author brandonbarrett
 */
public class URLScanner {
    Scanner sc = new Scanner(System.in);
    private String fundCode;
    
    public URLScanner(){}
    
public void setURL(){
    System.out.println("Enter your four letter fund code.");
    fundCode = sc.next();
}
public String getURL(){
    return fundCode;
}
}
