class PharmacyRunner {

    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();

        String medicine = "paracetamol";
        int quantity = 3;
        double discount = 5;

        double price = pharmacy.getPriceByMedicineName(medicine);
        double total = pharmacy.getTotalAmount(price, quantity);
        double finalAmount = pharmacy.applyDiscount(total, discount);

        System.out.println("Medicine: " + medicine);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}