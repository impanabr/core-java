class BusRunner {

    public static void main(String[] args) {

        Bus b1 = new Bus();

        double re = b1.getTicketPrice("Sleeper");
        System.out.println(re);

        re = b1.getTicketPrice("AC");
        System.out.println(re);

        re = b1.getTicketPrice("Non-AC");
        System.out.println(re);

        re = b1.getTicketPrice("Semi-Sleeper");
        System.out.println(re);

        re = b1.getTicketPrice("Luxury");
        System.out.println(re);

        System.out.println("-------------------------");

        re = b1.getFinalFare(800, 2, 10);
        System.out.println(re);
    }
}