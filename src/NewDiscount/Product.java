

package NewDiscount;

/**
 * @author deepshikha
 */
public class Product 
{
    private DiscountStrategy discount;    
    public String productID;
    private String productDesc;
    private double price;
//    private double totalPrice;   
    public Product(DiscountStrategy discount, String productID, String productDesc, double price) 
    {
        this.discount = discount;
        this.productID = productID;
        this.productDesc = productDesc;
        this.price = price;     
    }  
    
    public void setDiscount(DiscountStrategy ds) 
    {
	discount = ds;
    }     
    
    public  double getDiscount(double qty)
    {            
       System.out.println("Price is " + price);
       System.out.println("Qty is " + qty);
       double disAmt = discount.calculateDiscount(price, qty);
       System.out.println("DiscountA is " + disAmt);           
       return disAmt;     
    }

//    public  double getTotal(double price,double qty)
//    {         
//       double disAmt = discount.calculateDiscount(price, qty);
//       totalPrice=(price*qty)-disAmt;
//       System.out.println("Total Price is " + totalPrice);
//       return totalPrice;     
//    }
    public String getProductDesc() 
    {
       return productDesc;
    }

    public void setProductDesc(String productDesc) 
    {
       this.productDesc = productDesc;
    }

    public String getProductID() 
    {
        return productID;
    }

    public void setProductID(String productID) 
    {
        this.productID = productID;
    }

    public double getprice()
    {
        return price;
    }

    public void setprice(double price) 
    {
        this.price = price;
    } 
  
}
