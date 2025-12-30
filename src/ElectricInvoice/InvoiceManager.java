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



}
