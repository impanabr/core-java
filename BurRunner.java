class BusRunner {

    public static void main(String[] args) {

        Bus bus = new Bus();

        String route = "bangalore-mysore";
        int seats = 2;
        double discount = 10;

        double price = bus.getPriceByRoute(route);
        double total = bus.getTotalAmount(price, seats);
        double finalAmount = bus.applyDiscount(total, discount);

        System.out.println("Route: " + route);
        System.out.println("Seats: " + seats);
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}