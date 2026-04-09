class Zomato {

    public double getFoodPriceByFoodName(String foodName) {
        double price = 0.0;

        if (foodName.equals("Aloo Parata")) {
            price = 70;
        } else if (foodName.equals("Fried Rice")) {
            price = 50;
        } else if (foodName.equals("Ghee Rice")) {
            price = 70;
        } else if (foodName.equals("Paneer")) {
            price = 100;
        } else if (foodName.equals("Chole Bhature")) {
            price = 120;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}