class Amazon {

    public double getPriceByProductName(String productName) {
        System.out.println("invoking getPriceByProductName: " + productName);
        double price = 0.0;

        if ("mobile".equals(productName)) {
            price = 15000;
        } else if ("laptop".equals(productName)) {
            price = 50000;
        } else if ("headphones".equals(productName)) {
            price = 2000;
        } else if ("watch".equals(productName)) {
            price = 1500;
        } else if ("keyboard".equals(productName)) {
            price = 800;
        }

        System.out.println("end of method");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity) {
        double total = price * quantity;
        return total;
    }

    public double applyDiscount(double totalAmount, double discountPercent) {
        double discount = (totalAmount * discountPercent) / 100;
        return totalAmount - discount;
    }
}