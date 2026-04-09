class Hotel {

    public double getPriceByFoodName(String foodName) {
        System.out.println("Hotel item: " + foodName);
        double price = 0.0;

        if ("idli".equals(foodName)) {
            price = 40;
        } else if ("dosa".equals(foodName)) {
            price = 60;
        } else if ("meals".equals(foodName)) {
            price = 120;
        } else if ("chapati".equals(foodName)) {
            price = 50;
        } else if ("curd rice".equals(foodName)) {
            price = 70;
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