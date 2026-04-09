class Flipkart {

    public double getItemPriceByName(String itemName) {
        double price = 0.0;

        if (itemName.equals("Mobile")) {
            price = 15000;
        } else if (itemName.equals("Laptop")) {
            price = 50000;
        } else if (itemName.equals("TV")) {
            price = 30000;
        } else if (itemName.equals("Refrigerator")) {
            price = 25000;
        } else if (itemName.equals("Washing Machine")) {
            price = 20000;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}