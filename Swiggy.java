class Swiggy {

    public double getPriceByFoodName(String foodName) {
        System.out.println("invoking getPriceByFoodName: " + foodName);
        double price = 0.0;

        if ("egg rice".equals(foodName)) {
            price = 65;
        } else if ("fried rice".equals(foodName)) {
            price = 90.99;
        } else if ("aloo paratha".equals(foodName)) {
            price = 80.21;
        } else if ("biriyani".equals(foodName)) {
            price = 120;
        } else if ("boti gojju".equals(foodName)) {
            price = 100;
        } else {
            price = 0.0;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }
    public double getTotalAmountByPriceAndQuantity(double price, int quantity) {
        System.out.println("invoking getTotalAmountByPriceAndQuantity");

        double totalPrice = price * quantity;

        System.out.println("end of getTotalAmountByPriceAndQuantity");
        return totalPrice;
    }
    public double applyDiscount(double totalAmount, double discountPercent) {
        System.out.println("Applying discount...");

        double discount = (totalAmount * discountPercent) / 100;
        double finalAmount = totalAmount - discount;

        return finalAmount;
    }
}