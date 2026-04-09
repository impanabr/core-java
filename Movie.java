class Movie {

    public double getTicketPriceBySeatType(String seatType) {
        double price = 0.0;

        if (seatType.equals("Gold")) {
            price = 300;
        } else if (seatType.equals("Silver")) {
            price = 200;
        } else if (seatType.equals("Platinum")) {
            price = 500;
        } else if (seatType.equals("Balcony")) {
            price = 250;
        } else if (seatType.equals("Recliner")) {
            price = 600;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int tickets, double discount) {
        double total = price * tickets;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}