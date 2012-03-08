
package NewDiscount;

/**
 * @author deepshikha
 */
public class Customer 
{
    private String name;
    private String customerID;

    public Customer(String name, String customerID) 
    {
        this.name = name;
        this.customerID = customerID;
    }

    public String getCustomerID() 
    {
        return customerID;
    }

    public void setCustomerID(String customerID) 
    {
        this.customerID = customerID;
    }

    public String getName() 
    {
        return name;
    }

    public void setName(String name) 
    {
        this.name = name;
    }

}
