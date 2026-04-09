class Myntra {

    public double getClothPriceByName(String clothName) {
        double price = 0.0;

        if (clothName.equals("Shirt")) {
            price = 800;
        } else if (clothName.equals("Jeans")) {
            price = 1500;
        } else if (clothName.equals("Jacket")) {
            price = 3000;
        } else if (clothName.equals("T-Shirt")) {
            price = 500;
        } else if (clothName.equals("Kurta")) {
            price = 1200;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}