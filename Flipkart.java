class Flipkart {

    public double getPriceByProductName(String productName) {
        double price = 0.0;

        if ("tv".equals(productName)) {
            price = 30000;
        } else if ("fridge".equals(productName)) {
            price = 25000;
        } else if ("ac".equals(productName)) {
            price = 35000;
        } else if ("fan".equals(productName)) {
            price = 2000;
        } else if ("mixer".equals(productName)) {
            price = 3000;
        }

        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity) {
        return price * quantity;
    }

    public double applyDiscount(double totalAmount, double discountPercent) {
        return totalAmount - (totalAmount * discountPercent / 100);
    }
}