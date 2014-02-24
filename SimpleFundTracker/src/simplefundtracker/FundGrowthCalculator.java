package simplefundtracker;

/**
 *
 * @author brandonbarrett
 */
public class FundGrowthCalculator {
    private int months;
    private final int PERCENTGROWTH;
    private Double yearGrowthRate;
    private Double decadeGrowthRate;

    public FundGrowthCalculator() {
        this.months = 0;
        this.PERCENTGROWTH = 0;
    }

    public Double calculateYearGrowth(Double averageChange) {
        yearGrowthRate = averageChange * 52.0;

        return yearGrowthRate;
    }

    public Double calculateDecadeGrowth(Double yearGrowthRate) {
        decadeGrowthRate = yearGrowthRate * 10.0;

        return decadeGrowthRate;
    }

    public Double getYearGrowth() {
        return yearGrowthRate;
    }

    public Double getDecadeGrowth() {
        return decadeGrowthRate;
    }
}


