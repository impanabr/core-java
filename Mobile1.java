class Mobile1 {
    String brand;
    String model;
    int price;
    int batteryCapacity;
    boolean is5G;
	
    public Mobile1() {
        System.out.println("Default constructor called");
    }
    public Mobile1(String brand,String model,int price,int batteryCapacity,boolean is5G) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.is5G = is5G;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Battery: " + batteryCapacity);
        System.out.println("5G Supported: " + is5G);
    }
}
