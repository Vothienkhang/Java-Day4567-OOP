// +------------------------------+
//|           Customer           |
//+------------------------------+
//| - ownerName: String          |
//| - houseNumber: String        |
//| - electricityMeterId: String |
//+------------------------------+
//| + Customer()                 |
//| + Customer(ownerName, houseNumber, electricityMeterId) |
//| + getOwnerName(): String     |
//| + setOwnerName(String): void |
//| + getHouseNumber(): String   |
//| + setHouseNumber(String): void |
//| + getElectricityMeterId(): String |
//| + setElectricityMeterId(String): void |
//| + toString(): String         |
//+------------------------------+

package ElectricInvoice;

public class Customer {
    private String ownerName;
    private String houseNumber;
    private String electricityMeterID;

    public Customer() {}

    public Customer(String ownerName, String houseNumber, String electricityMeterID) {
        this.ownerName = ownerName;
        this.houseNumber = houseNumber;
        this.electricityMeterID = electricityMeterID;
    }

    // Getter & Setter
    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getElectricityMeterID() {
        return electricityMeterID;
    }

    public void setElectricityMeterID(String electricityMeterID) {
        this.electricityMeterID = electricityMeterID;
    }

    @Override
    public String toString() {
        return "Customer " +
                "ownerName = " + ownerName + '\'' + ", houseNumber='" + houseNumber + '\'' +
                ", electricityMeterId='" + electricityMeterId + '\'' +
                '}';
    }
}
