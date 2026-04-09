class SwiggyRunner {

    public static void main(String[] args) {

        Swiggy swiggy = new Swiggy();

        String foodName = "biriyani";
        int quantity = 2;
        double discountPercent = 10; 
		
        double price = swiggy.getPriceByFoodName(foodName);
        double totalAmount = swiggy.getTotalAmountByPriceAndQuantity(price, quantity);
        double finalAmount = swiggy.applyDiscount(totalAmount, discountPercent);

        System.out.println("Food: " + foodName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Final Amount after Discount: " + finalAmount);
    }
}