class ZomatoRunner {

    public static void main(String[] args) {

        Zomato zomato = new Zomato();

        String foodName = "pizza";
        int quantity = 2;
        double discount = 10;

        double price = zomato.getPriceByFoodName(foodName);
        double total = zomato.getTotalAmountByPriceAndQuantity(price, quantity);
        double finalAmount = zomato.applyDiscount(total, discount);

        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}