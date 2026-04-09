class ZomatoRunner {

    public static void main(String[] args) {

        Zomato z1 = new Zomato();

        double re = z1.getFoodPriceByFoodName("Biryani");
        System.out.println(re);

        re = z1.getFoodPriceByFoodName("Aloo Parata");
        System.out.println(re);

        re = z1.getFoodPriceByFoodName("Paneer");
        System.out.println(re);

        re = z1.getFoodPriceByFoodName("Chapathi");
        System.out.println(re);

        re = z1.getFoodPriceByFoodName("Ghee Rice");
        System.out.println(re);

        System.out.println("-------------------------");

        re = z1.getTotalAmountByPriceQuantityAndDiscount(100, 3, 10);
        System.out.println(re);
    }
}