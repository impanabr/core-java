class SwiggyRunner {

    public static void main(String[] args) {

        Swiggy s1 = new Swiggy();

        double re = s1.getFoodPriceByFoodName("Dosa");
        System.out.println(re);

        re = s1.getFoodPriceByFoodName("Idli");
        System.out.println(re);

        re = s1.getFoodPriceByFoodName("Vada");
        System.out.println(re);

        re = s1.getFoodPriceByFoodName("Upma");
        System.out.println(re);

        re = s1.getFoodPriceByFoodName("Poori");
        System.out.println(re);

        System.out.println("-------------------------");

        re = s1.getTotalAmountByPriceQuantityAndDiscount(50, 2, 5);
        System.out.println(re);
    }
}