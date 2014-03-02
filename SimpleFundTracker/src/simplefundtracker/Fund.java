package simplefundtracker;

//~--- JDK imports ------------------------------------------------------------

import java.io.IOException;

/**
 *
 * @author brandonbarrett
 */
public class Fund extends Connector {
    private String fundName;
    private int todaysValue;
    private Double initialValue;
    private Double yearlyContribution;

    public Fund(String fundName) throws IOException {
        fundName     = this.getFundName();
        initialValue = 150.00;
    }

    public Double yearlyContributionTotal() {
        yearlyContribution = initialValue * 26.0;

        return yearlyContribution;
    }
    
    
}



