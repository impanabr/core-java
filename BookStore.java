class BookStore {

    public double getBookPriceByName(String bookName) {
        double price = 0.0;

        if (bookName.equals("Java")) {
            price = 400;
        } else if (bookName.equals("Python")) {
            price = 350;
        } else if (bookName.equals("C++")) {
            price = 300;
        } else if (bookName.equals("Data Structures")) {
            price = 450;
        } else if (bookName.equals("Algorithms")) {
            price = 500;
        }

        return price;
    }

    public double getTotalAmountByPriceQuantityAndDiscount(double price, int quantity, double discount) {
        double total = price * quantity;
        double discountAmount = total * (discount / 100);
        return total - discountAmount;
    }
}