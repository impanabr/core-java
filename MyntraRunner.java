class MyntraRunner {

    public static void main(String[] args) {

        Myntra myntra = new Myntra();

        String product = "jeans";
        int quantity = 2;
        double discount = 15;

        double price = myntra.getPriceByProductName(product);
        double total = myntra.getTotalAmount(price, quantity);
        double finalAmount = myntra.applyDiscount(total, discount);

        System.out.println("Product: " + product);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}