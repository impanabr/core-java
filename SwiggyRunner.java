class SwiggyRunner{
    public static void main(String[] args) {
		Swiggy swiggy = new Swiggy();
        System.out.println(swiggy.login("swiggy@gmail.com", "1234"));
        System.out.println(swiggy.login(9876543210L, 3333));
        System.out.println(swiggy.orderFood("Pizza"));
        System.out.println(swiggy.orderFood("Burger", 2));
        System.out.println(swiggy.orderFood(200.0, 3));
        System.out.println(swiggy.orderFood("Biryani", "Hyderabad"));
        System.out.println(swiggy.orderFood("Dosa", 2, 100.0));
    }
}