import java.text.DecimalFormat;

public class ConstructionPricer {

    private final double LUMBER_COST = 11.50;
    private final double WINDOW_COST = 25.75;

    private double amountOfLumber, amountOfWindows, taxRate;
    private double lumberCosts, windowCosts;
    private double totalCost, totalWithTax;

    DecimalFormat df = new DecimalFormat("0.00");


    public ConstructionPricer(double amountOfLumber, double amountOfWindows, double taxRate) {

        this.amountOfLumber = amountOfLumber;
        this.amountOfWindows = amountOfWindows;
        this.taxRate = taxRate;


    }

    private void calculateCosts() {

        this.lumberCosts = this.amountOfLumber * LUMBER_COST;
        this.windowCosts = this.amountOfWindows * WINDOW_COST;

        this.totalCost = this.lumberCosts + this.windowCosts;
        this.totalWithTax = (this.totalCost * this.taxRate) + this.totalCost;

    }

    public void printCosts() {
        calculateCosts();

        System.out.println("Total Cost: " + df.format(this.totalCost) + "\nTotal with Tax: " + df.format(this.totalWithTax));
    }

}
