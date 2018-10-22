public class Stock {
    String symbol;
    String name;
    double prevClosingPrice;
    double currentPrice;

    public Stock(String symbol, String name, double prevClosingPrice, double currentPrice) {
        this.symbol = symbol;
        this.name = name;
        this.prevClosingPrice = prevClosingPrice;
        this.currentPrice = currentPrice;
    }

    public double getChangePercent()
    {
        System.out.println("The percent change is: " + ((currentPrice-prevClosingPrice)/prevClosingPrice)*100+"%");
    return ((currentPrice-prevClosingPrice)/prevClosingPrice)*100; }




}
