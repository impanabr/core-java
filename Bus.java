class Bus {

    public double getTicketPriceByType(String type) {
        double price = 0.0;

        if (type.equals("Sleeper")) {
            price = 800;
        } else if (type.equals("AC")) {
            price = 1200;
        } else if (type.equals("Non-AC")) {
            price = 500;
        } else if (type.equals("Semi-Sleeper")) {
            price = 900;
        } else if (type.equals("Luxury")) {
            price = 1500;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int seats, double discount) {
        double total = price * seats;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}