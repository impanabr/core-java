class Amazon {

    public double getProductPriceByName(String productName) {
        double price = 0.0;

        if (productName.equals("Book")) {
            price = 200;
        } else if (productName.equals("Bag")) {
            price = 500;
        } else if (productName.equals("Watch")) {
            price = 1000;
        } else if (productName.equals("Shoes")) {
            price = 1500;
        } else if (productName.equals("Headphones")) {
            price = 2000;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}