public class Stock {
    //Declare data types and names for the variables im gonna use
    String symbol;
    String name;
    double prevClosingPrice;
    double currentPrice;
//Making a constructor that takes everything.
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

//Making a getter and setter to easily set new prevClosing and CurrentPrice
    public double getPrevClosingPrice() {
        return prevClosingPrice;
    }

    public void setPrevClosingPrice(double prevClosingPrice) {
        this.prevClosingPrice = prevClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }
}
