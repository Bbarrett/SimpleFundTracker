
/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
 */
package simplefundtracker;

//~--- non-JDK imports --------------------------------------------------------

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author brandonbarrett
 */
public class Connector {
    Document fundDocument;
    private String fundElement;
    private Double convertedFund;

    public Connector() throws IOException {}

    public void findFund() throws IOException {

        // Connect to a finance website, grab fund. Make it a String.
        fundDocument = Jsoup.connect("http://finance.yahoo.com/q?s=FFFHX").get();
        fundElement  = fundDocument.getElementById("yfs_c10_fffhx").ownText();
    }

    public String getfundElement() {
        return fundElement;
    }

    public Double getConvertedFund() {
        return convertedFund;
    }
}



