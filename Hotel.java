class Hotel {

    public double getRoomPriceByType(String roomType) {
        double price = 0.0;

        if (roomType.equals("Single")) {
            price = 1000;
        } else if (roomType.equals("Double")) {
            price = 2000;
        } else if (roomType.equals("Suite")) {
            price = 5000;
        } else if (roomType.equals("Deluxe")) {
            price = 3000;
        } else if (roomType.equals("Luxury")) {
            price = 7000;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int days, double discount) {
        double total = price * days;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}