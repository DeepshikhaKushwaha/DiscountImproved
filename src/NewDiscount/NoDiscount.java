
package NewDiscount;

/** 
 * @author deepshikha
 */
public class NoDiscount implements DiscountStrategy
{
    
    private double percent = 0.0;
//    private double qty;
//    private double price;

//    public NoDiscount( double percent, double price, double qty) 
//    {
//          this.price = price;
//          this.percent = percent;
//          this.qty = qty;
//    }
      
    public NoDiscount()
      {
      }

    public double getPercent()
    {
        return percent;
    }

    public void setPercent(double percent) 
    {
        this.percent = percent;
    }

//    public double getPrice() 
//    {
//        return price;
//    }
//
//    public void setPrice(double price) 
//    {
//        this.price = price;
//    }
//
//    public double getQty()
//    {
//        return qty;
//    }
//
//    public void setQty(double qty) 
//    {
//        this.qty = qty;
//    }    
   
    public double calculateDiscount(double price, double qty)
    {
         return price *  percent * qty;
    }
}

    
