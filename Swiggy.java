class Swiggy{
    public boolean login(String email, String password) {
        return email.equals("swiggy@gmail.com") && password.equals("1234");
    }
    public boolean login(long phone, int otp) {
        return phone == 9876543210L && otp == 3333;
    }
    public String orderFood(String food) {
        return "Ordered: " + food;
    }
    public String orderFood(String food, int quantity) {
        return "Ordered " + quantity + " plates of " + food;
    }
	 public double orderFood(double price, int quantity) {
        return price * quantity;
    }
    public String orderFood(String food, String location) {
        return "Delivering " + food + " to " + location;
    }
    public String orderFood(String food, int quantity, double price) {
        return "Bill: " + (quantity * price);
    }
}