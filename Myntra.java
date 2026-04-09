class Myntra {

    public double getPriceByProductName(String productName) {
        double price = 0.0;

        if ("shirt".equals(productName)) {
            price = 999;
        } else if ("jeans".equals(productName)) {
            price = 1499;
        } else if ("tshirt".equals(productName)) {
            price = 599;
        } else if ("jacket".equals(productName)) {
            price = 1999;
        } else if ("shoes".equals(productName)) {
            price = 2499;
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