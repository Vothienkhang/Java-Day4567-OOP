// +-----------------------------------+
//|        ElectricityInvoice         |
//+-----------------------------------+
//| - customer: Customer              |
//| - previousReading: int            |
//| - currentReading: int             |
//+-----------------------------------+
//| + ElectricityInvoice()            |
//| + ElectricityInvoice(customer, previousReading, currentReading) |
//| + getCustomer(): Customer         |
//| + setCustomer(Customer): void     |
//| + getPreviousReading(): int       |
//| + setPreviousReading(int): void   |
//| + getCurrentReading(): int        |
//| + setCurrentReading(int): void    |
//| + calculateAmountDue(): long      |
//| + toString(): String              |
//+-----------------------------------+

package ElectricInvoice;

public class ElectricityInvoice {
    private Customer customer;
    private int previousReading;
    private int currentReading;

    public ElectricityInvoice() {}

    public  ElectricityInvoice(Customer customer, int previousReading, int currentReading) {
        this.customer = customer;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getPreviousReading() {
        return previousReading;
    }

    public void setPreviousReading(int previousReading) {
        this.previousReading = previousReading;
    }

    public int getCurrentReading() {
        return currentReading;
    }

    public void setCurrentReading(int currentReading) {
        this.currentReading = currentReading;
    }

    // Calculate (current - previous) * 5
    public long calculateAmountDue() {
        int consumption = currentReading - previousReading;
        if (consumption < 0) {
            return 0;
        } else {
            return (long) consumption * 5;
        }
    }

    @Override
    public String toString() {
        return "ElectricityInvoice{" +
                "customer=" + customer +
                ", previousReading=" + previousReading +
                ", currentReading=" + currentReading +
                ", amountDue=" + calculateAmountDue() +
                '}';
    }
}
