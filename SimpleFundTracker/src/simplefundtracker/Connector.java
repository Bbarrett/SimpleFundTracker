package simplefundtracker;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.IOException;
import org.jsoup.nodes.Element;

/**
 *
 * @author brandonbarrett
 */
public class Connector {
    
    private String fundName;
    private Document fundDocument;
    private String fundElement;

    public Connector() throws IOException {}

    public void findFund(String fundCode) throws IOException {

        // Connect to a finance website, grab fund. Make it a String.
   fundDocument = Jsoup.connect("http://finance.yahoo.com/q?s="+fundCode).get();
   fundElement  = fundDocument.getElementById("yfs_c10_"+fundCode).ownText();
   fundName = fundDocument.getElementById("yfi_rt_quote_summary").getElementsByTag("h2").text();
    }
    public String getFundElement(){
        return fundElement;
    }
    public String getfundName() {
        return fundName;
    }
    
}



