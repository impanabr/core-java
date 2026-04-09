class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart flipkart = new Flipkart();

        String product = "tv";
        int quantity = 1;
        double discount = 10;

        double price = flipkart.getPriceByProductName(product);
        double total = flipkart.getTotalAmountByPriceAndQuantity(price, quantity);
        double finalAmount = flipkart.applyDiscount(total, discount);

        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}