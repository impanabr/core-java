class Pharmacy {

    public double getMedicinePriceByName(String medicine) {
        double price = 0.0;

        if (medicine.equals("Paracetamol")) {
            price = 50;
        } else if (medicine.equals("Dolo")) {
            price = 40;
        } else if (medicine.equals("Crocin")) {
            price = 60;
        } else if (medicine.equals("Aspirin")) {
            price = 70;
        } else if (medicine.equals("Vitamin C")) {
            price = 100;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}