class AmazonRunner {
	
    public static void main(String[] args) {

        Amazon a1 = new Amazon();

        double re = a1.getProductPriceByName("Book");
        System.out.println(re);

        re = a1.getProductPriceByName("Bag");
        System.out.println(re);

        re = a1.getProductPriceByName("Watch");
        System.out.println(re);

        re = a1.getProductPriceByName("Shoes");
        System.out.println(re);

        re = a1.getProductPriceByName("Headphones");
        System.out.println(re);

        System.out.println("-------------------------");

        re = a1.getTotalAmountByPriceQuantityAndDiscount(500, 2, 10);
        System.out.println(re);
    }
}