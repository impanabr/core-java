class BookStoreRunner {

    public static void main(String[] args) {

        BookStore b1 = new BookStore();

        double re = b1.getBookPriceByName("Java");
        System.out.println(re);

        re = b1.getBookPriceByName("Python");
        System.out.println(re);

        re = b1.getBookPriceByName("C++");
        System.out.println(re);

        re = b1.getBookPriceByName("HTML");
        System.out.println(re);

        re = b1.getBookPriceByName("CSS");
        System.out.println(re);

        System.out.println("-------------------------");

        re = b1.getTotalAmountByPriceQuantityAndDiscount(400, 2, 10);
        System.out.println(re);
    }
}