/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NewDiscount;

/**
 *
 * @author deepshikha
 */
public interface DiscountStrategy {
     abstract double calculateDiscount(double price, double qty);
     
//    public void setPrice(double price);
//    public void setQty(double qty);
}
