package NewDiscount;

public class NewYearDiscount implements DiscountStrategy {

//    private double price;
    private double percent = .20;
//    private double qty;
    
    public NewYearDiscount() {
    }

//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }


//    public NewYearDiscount(double price, double percent, double qty) {
//        this.price = price;
//        this.percent = percent;
//        this.qty = qty;
//    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

//    public double getQty() {
//        return qty;
//    }
//
//    public void setQty(double qty) {
//        this.qty = qty;
//    }

    public double calculateDiscount(double price, double qty) {
        return price * percent * qty;
    }
}
