class Swiggy {

    public double getFoodPriceByFoodName(String foodName) {
        double price = 0.0;

        if (foodName.equals("Dosa")) {
            price = 40;
        } else if (foodName.equals("Idli")) {
            price = 30;
        } else if (foodName.equals("Vada")) {
            price = 20;
        } else if (foodName.equals("Upma")) {
            price = 35;
        } else if (foodName.equals("Poori")) {
            price = 45;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}