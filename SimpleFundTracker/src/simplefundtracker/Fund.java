package simplefundtracker;
import java.io.IOException;

/**
 *
 * @author brandonbarrett
 */
public class Fund extends Connector {
 
    private Double initialValue;
    private Double yearlyContribution;

    public Fund(String fundName) throws IOException {
        
        initialValue = 150.00;
    }

    public Double yearlyContributionTotal(Double initialValue) {
        yearlyContribution = initialValue * 26.0;

        return yearlyContribution;
    }
    
    
}



