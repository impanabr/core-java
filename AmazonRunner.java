class AmazonRunner {

    public static void main(String[] args) {

        Amazon amazon = new Amazon();

        String product = "mobile";
        int quantity = 2;
        double discount = 15;

        double price = amazon.getPriceByProductName(product);
        double total = amazon.getTotalAmountByPriceAndQuantity(price, quantity);
        double finalAmount = amazon.applyDiscount(total, discount);

        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}