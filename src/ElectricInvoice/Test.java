package ElectricInvoice;

public class Test {
    public static void main(String[] args) {
        InvoiceManager manager = new InvoiceManager();

        Customer c1 = new Customer("Võ Thiện Khang", "342F", "M001");
        ElectricityInvoice e1 = new ElectricityInvoice(c1, 100, 150);

        Customer c2 = new Customer("Nguyen Van A", "1A", "M002");
        ElectricityInvoice e2 = new ElectricityInvoice(c2, 200, 220);

        Customer c3 = new Customer("Nguyen Van B", "1B", "M003");
        ElectricityInvoice e3 = new ElectricityInvoice(c3, 300, 220);

        manager.addInvoice(e1);
        manager.addInvoice(e2);

        System.out.println("====Initial list====");
        manager.printAll();

        System.out.println("\n====Update M001====");
        manager.updateByMeterID("M001", "Lê Bội Phuong", "246", 100, 180);
        manager.printAll();

        System.out.println("\n====Remove M002====");
        manager.removeByMeterID("M002");
        manager.printAll();

        System.out.println("\n====Add M003====");
        manager.addInvoice(e3);
        manager.printAll();
    }
}
