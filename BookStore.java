class BookStore {

    public double getPriceByBookName(String bookName) {
        double price = 0.0;

        if ("java".equals(bookName)) {
            price = 500;
        } else if ("python".equals(bookName)) {
            price = 450;
        } else if ("dsa".equals(bookName)) {
            price = 600;
        } else if ("dbms".equals(bookName)) {
            price = 550;
        } else if ("os".equals(bookName)) {
            price = 400;
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