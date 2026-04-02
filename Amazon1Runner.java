class Amazon1Runner {
    public static void main(String[] args) {

        Amazon1 amazon1 = new Amazon1();
        System.out.println(amazon1.login("user@gmail.com", "1234"));
        System.out.println(amazon1.login(9876543210L, 1111));
        System.out.println(amazon1.order("Laptop"));
        System.out.println(amazon1.order("Mobile", 2));
        System.out.println(amazon1.order(50000.0, 2));
        System.out.println(amazon1.order("TV", "Bangalore"));
        System.out.println(amazon1.order("Headphones", 2, 1500.0));
	}
}

