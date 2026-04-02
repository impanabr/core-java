class Flipkart1Runner{
    public static void main(String[] args) {
		
		Flipkart1 flipkart1 = new Flipkart1();
        System.out.println(flipkart1.login("flipuser", "1234"));
        System.out.println(flipkart1.login(9876543210L, 2222));
        System.out.println(flipkart1.search("Shoes"));
        System.out.println(flipkart1.search("Shirt", 2));
        System.out.println(flipkart1.search(999.99));
        System.out.println(flipkart1.search("Watch", "Accessories"));
        System.out.println(flipkart1.search("Bag", 2, 1200.0));
	}
}
