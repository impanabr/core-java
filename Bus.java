class Bus {

    public double getPriceByRoute(String route) {
        double price = 0.0;

        if ("bangalore-mysore".equals(route)) {
            price = 300;
        } else if ("bangalore-hubli".equals(route)) {
            price = 600;
        } else if ("bangalore-delhi".equals(route)) {
            price = 1500;
        } else if ("mysore-mangalore".equals(route)) {
            price = 500;
        } else if ("hubli-goa".equals(route)) {
            price = 700;
        }

        return price;
    }

    public double getTotalAmount(double price, int seats) {
        return price * seats;
    }

    public double applyDiscount(double total, double discount) {
        return total - (total * discount / 100);
    }
}