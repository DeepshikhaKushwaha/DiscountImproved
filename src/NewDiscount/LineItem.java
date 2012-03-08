/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewDiscount;

/**
 *
 * @author deepshikha
 */
public class LineItem 
{
private Product product;
//private String productId;
private double qty;
//private double subTotal;
//private double discountAmount;

private Product[] productDb = {
    new Product(new NewYearDiscount(),"A101","Hat",19.95 ),
    new Product(new NoDiscount(),"B101","Glove",25.95 ),
    new Product(new NoDiscount(),"C101","Belt",9.25 )  
};


public LineItem(String productId , double qty) 
{
//    this.productId =  productId;
    this.qty = qty;
    product = findProductById(productId);
}

  private Product findProductById(String id) 
  {
       Product product = null; 
        for (Product p : productDb) 
        {
            if (id.equals(p.getProductID()))
            {
                product = p;
                break;
            }
        }
        return product;
    }

    public String getProductId()
    {
    return product.getProductID();
    }
    
    public String getLineItemData() 
    {
        return getProductId() + "    " + product.getProductDesc() + "    "
                + product.getprice() + "    " + qty 
                + "    " + product.getDiscount(qty)
                + "    " + getSubTotal();
    }

    
//    private String getName() 
//    {
//        return product.getProductDesc();
//    }

    public void setProductDb(Product[] productDb) 
    {
        this.productDb = productDb;
    }
    
    
    public double getDiscountAmount() 
    {
        return product.getDiscount(qty);
    }

    public Product getProduct() 
    {
        return product;
    }

    public void setProduct(Product product) 
    {
        this.product = product;
    }

    public double getQty() 
    {
        return qty;
    }

    public void setQty(double qty) 
    {
        this.qty = qty;
    }

    public double getSubTotal() 
    {
     
        return (product.getprice()*qty) - product.getDiscount(qty);
    }

//    Product getLineItemData(String productId, double qty) 
//    {
//        product.setProductID(productId);
//        product.setprice(qty);
//        return product;
//    }

//    public void setProductId(String productId)
//    {
//        this.productId = productId;
//    }
//    private double getDiscount()
//    {
//        return product.getDiscount(qty);
//    }

}


    
    
    
  