class Zomato {

    public double getPriceByFoodName(String foodName) {
        System.out.println("invoking getPriceByFoodName: " + foodName);
        double price = 0.0;

        if ("pizza".equals(foodName)) {
            price = 150;
        } else if ("burger".equals(foodName)) {
            price = 80;
        } else if ("pasta".equals(foodName)) {
            price = 120;
        } else if ("sandwich".equals(foodName)) {
            price = 70;
        } else if ("noodles".equals(foodName)) {
            price = 90;
        }

        System.out.println("end of getPriceByFoodName");
        return price;
    }

    public double getTotalAmountByPriceAndQuantity(double price, int quantity) {
        System.out.println("invoking getTotalAmountByPriceAndQuantity");
        double total = price * quantity;
        System.out.println("end of method");
        return total;
    }

    public double applyDiscount(double totalAmount, double discountPercent) {
        double discount = (totalAmount * discountPercent) / 100;
        return totalAmount - discount;
    }
}