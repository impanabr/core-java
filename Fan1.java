class Fan1 {
    String brand;
    int speed;
    String color;
    boolean isOn;
	
    public Fan1() {
        System.out.println("Default constructor called");
    }
    public Fan1(String brand,int speed,String color,boolean isOn) {
        this.brand = brand;
        this.speed = speed;
        this.color = color;
        this.isOn = isOn;
    }
    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
        System.out.println("Color: " + color);
        System.out.println("Is On: " + isOn);
    }
}