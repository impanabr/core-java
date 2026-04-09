class MyntraRunner {

    public static void main(String[] args) {

        Myntra m1 = new Myntra();

        double re = m1.getClothPriceByName("Shirt");
        System.out.println(re);

        re = m1.getClothPriceByName("Jeans");
        System.out.println(re);

        re = m1.getClothPriceByName("Jacket");
        System.out.println(re);

        re = m1.getClothPriceByName("T-Shirt");
        System.out.println(re);

        re = m1.getClothPriceByName("Kurta");
        System.out.println(re);

        System.out.println("-------------------------");

        re = m1.getTotalAmountByPriceQuantityAndDiscount(1000, 3, 20);
        System.out.println(re);
    }
}