class Flipkart1{
    public boolean login(String username, String password) {
        return username.equals("flipuser") && password.equals("1234");
    }

    public boolean login(long phone, int otp) {
        return phone == 9876543210L && otp == 2222;
    }
      public String search(String product) {
        return "Searching: " + product;
    }
	  public String search(String product, int quantity) {
        return "Product: " + product + ", Qty: " + quantity;
    }
	public double search(double price) {
        return price;
    }
	public String search(String product, String category) {
        return "Product: " + product + ", Category: " + category;
    }
	public String search(String product, int quantity, double price) {
        return "Total: " + (quantity * price);
    }
}