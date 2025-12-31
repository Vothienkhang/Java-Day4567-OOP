// +---------------------------------------------+
//|              InvoiceManager                  |
//+---------------------------------------------+
//| - invoices: List<ElectricityInvoice>        |
//+---------------------------------------------+
//| + InvoiceManager()                          |
//| + addInvoice(invoice: ElectricityInvoice): void |
//| + searchByMeterId(meterId: String): ElectricityInvoice |
//| + removeByMeterId(meterId: String): boolean |
//| + updateByMeterId(meterId: String, newOwnerName: String, newHouseNumber: String, newPreviousReading: int, newCurrentReading: int): boolean |
//| + printAll(): void                          |
//+---------------------------------------------+

package ElectricInvoice;

import java.util.ArrayList;
import java.util.List;

public class InvoiceManager {
    private final List<ElectricityInvoice> invoices = new ArrayList<>();

    // Add invoice
    public void addInvoice(ElectricityInvoice invoice){
        invoices.add(invoice);
    }

    // Search invoice by meter ID
    public ElectricityInvoice searchByMeterID(String meterID) {
        for (ElectricityInvoice invoice : invoices) {
            if (invoice.getCustomer() != null &&
                    invoice.getCustomer().getElectricityMeterID().equalsIgnoreCase(meterID)) {
                return invoice;
            }
        }
        return null;
    }

    // Remove invoice by meter ID
    public boolean removeByMeterID(String meterID) {
        ElectricityInvoice invoice = searchByMeterID(meterID);
        if (invoice != null) {
            invoices.remove(invoice);
            return true;
        } else  {
            return false;
        }
    }

    // Update invoice by meter ID
    public boolean updateByMeterID(String meterID, String newOwnerName, String newHouseNumber, int newPreviousReading, int newCurrentReading) {
        ElectricityInvoice invoice = searchByMeterID(meterID);
        if (invoice != null) {
            Customer updateCustomer = new Customer(newOwnerName, newHouseNumber, meterID);
            invoice.setCustomer(updateCustomer);
            invoice.setPreviousReading(newPreviousReading);
            invoice.setCurrentReading(newCurrentReading);
            return true;
        } else   {
            return false;
        }
    }

    public void printAll() {
        if (invoices.isEmpty()) {
            System.out.println("No invoices found");
            return;
        }
        for (ElectricityInvoice invoice : invoices) {
            System.out.println(invoice);
        }
    }
}
