
package NewDiscount;


public class Startup 
{
 public static void main(String[] args) 
 {
        CashRegister cr = new CashRegister();
        cr.startNewSale("K800");
        cr.addProduct("A101", 4);
        cr.addProduct("B101", 2);
        cr.addProduct("C101", 9);
        
        cr.displayReceipt();
 }
}

