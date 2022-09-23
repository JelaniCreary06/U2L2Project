public class ConstructionPricer {

    private final double LUMBER_COST = 11.50;
    private final double WINDOW_COST = 25.75;


    public ConstructionPricer(double amountOfLumber, double amountOfWindows, double taxInArea) {

        double totalCost, tCtax;
        double lumberCosts, windowCosts;

        lumberCosts = amountOfLumber * LUMBER_COST;
        windowCosts = amountOfWindows * WINDOW_COST;

        totalCost = lumberCosts + windowCosts;
        tCtax = totalCost + (totalCost *taxInArea)


        System.out.println("Total Cost: " + totalCost +".\n Total Cost with Tax: " + tCtax);

    }

}
