class HotelRunner {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        String foodName = "dosa";
        int quantity = 3;
        double discount = 10;

        double price = hotel.getPriceByFoodName(foodName);
        double total = hotel.getTotalAmount(price, quantity);
        double finalAmount = hotel.applyDiscount(total, discount);

        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}