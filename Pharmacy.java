class Pharmacy {

    public double getPriceByMedicineName(String medicineName) {
        double price = 0.0;

        if ("paracetamol".equals(medicineName)) {
            price = 30;
        } else if ("dolo".equals(medicineName)) {
            price = 35;
        } else if ("vitamin c".equals(medicineName)) {
            price = 50;
        } else if ("antibiotic".equals(medicineName)) {
            price = 120;
        } else if ("cough syrup".equals(medicineName)) {
            price = 90;
        }

        return price;
    }

    public double getTotalAmount(double price, int quantity) {
        return price * quantity;
    }

    public double applyDiscount(double total, double discount) {
        return total - (total * discount / 100);
    }
}