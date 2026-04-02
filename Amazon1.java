class Amazon1{
    public boolean login(String email, String password) {
        return email.equals("user@gmail.com") && password.equals("1234");
    }
    public boolean login(long phone, int otp) {
        return phone == 9876543210L && otp == 1111;
    }
    public String order(String product) {
        return "Ordered: " + product;
    }
	    public String order(String product, int quantity) {
            return "ordered " + quantity + " " + product;
    }
      public double order(double price, int quantity) {
        return price * quantity;
    }
      public String order(String product, String address) {
        return "Delivering " + product + " to " + address;
    }
      public String order(String product, int quantity, double price) {
        return "Total cost: " + (quantity * price);
    }
}
