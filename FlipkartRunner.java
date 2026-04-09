class FlipkartRunner {

    public static void main(String[] args) {

        Flipkart f1 = new Flipkart();

        double re = f1.getItemPriceByName("Mobile");
        System.out.println(re);

        re = f1.getItemPriceByName("Laptop");
        System.out.println(re);

        re = f1.getItemPriceByName("TV");
        System.out.println(re);

        re = f1.getItemPriceByName("Refrigerator");
        System.out.println(re);

        re = f1.getItemPriceByName("Washing Machine");
        System.out.println(re);

        System.out.println("-------------------------");

        re = f1.getTotalAmountByPriceQuantityAndDiscount(20000, 2, 10);
        System.out.println(re);
    }
}