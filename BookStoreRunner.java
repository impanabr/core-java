class BookStoreRunner {

    public static void main(String[] args) {

        BookStore store = new BookStore();

        String book = "java";
        int quantity = 1;
        double discount = 5;

        double price = store.getPriceByBookName(book);
        double total = store.getTotalAmount(price, quantity);
        double finalAmount = store.applyDiscount(total, discount);

        System.out.println("Book: " + book);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}