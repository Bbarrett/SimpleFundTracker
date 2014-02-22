
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

    public void findFund(String fundCode) throws IOException {

        // Connect to a finance website, grab fund. Make it a String.
        fundDocument = Jsoup.connect("http://finance.yahoo.com/q?s="+fundCode).get();
        fundElement  = fundDocument.getElementById("yfs_c10_"+fundCode).ownText();
    }

    public String getfundElement() {
        return fundElement;
    }

    public Double getConvertedFund() {
        return convertedFund;
    }
}



