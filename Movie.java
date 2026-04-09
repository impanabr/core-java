class Movie {

    public double getPriceByMovieName(String movieName) {
        double price = 0.0;

        if ("kgf".equals(movieName)) {
            price = 200;
        } else if ("rrr".equals(movieName)) {
            price = 180;
        } else if ("jawan".equals(movieName)) {
            price = 220;
        } else if ("leo".equals(movieName)) {
            price = 210;
        } else if ("salaar".equals(movieName)) {
            price = 230;
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