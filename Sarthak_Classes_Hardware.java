public class Sarthak_Classes_Hardware {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    //Itest

    public Sarthak_Classes_Hardware(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        setQuantity(quantity);
        setPricePerItem(pricePerItem);
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartDescription() {
        return partDescription;
    }

    public void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem > 0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }
    public static void main (String args[])
    {
        Sarthak_Classes_Hardware obj1=new Sarthak_Classes_Hardware("1234","Hammer",2,100.0);
        Sarthak_Classes_Hardware obj2=new Sarthak_Classes_Hardware("1235","Nail",10,10.0);
        System.out.println("Part Number: "+obj1.getPartNumber());
        System.out.println("Part Description: "+obj1.getPartDescription());
        System.out.println("Quantity: "+obj1.getQuantity());
        System.out.println("Price Per Item: "+obj1.getPricePerItem());
        System.out.println("Invoice Amount: "+obj1.getInvoiceAmount());
        System.out.println("Part Number: "+obj2.getPartNumber());
        System.out.println("Part Description: "+obj2.getPartDescription());
        System.out.println("Quantity: "+obj2.getQuantity());
        System.out.println("Price Per Item: "+obj2.getPricePerItem());
        System.out.println("Invoice Amount: "+obj2.getInvoiceAmount());
    }
}
