package elements;

/**
 *
 * @author brandonbarrett
 */
public class FundGrowthCalculator {
   

    public FundGrowthCalculator() {}

    public Double calculateYearGrowth(Double averageChange) {
        Double yearGrowthRate = averageChange * 52.0;

        return yearGrowthRate;
    }

    public Double calculateDecadeGrowth(Double yearGrowthRate) {
        Double decadeGrowthRate = yearGrowthRate * 10.0;

        return decadeGrowthRate;
    }

}

   



