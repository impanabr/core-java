class MovieRunner {

    public static void main(String[] args) {

        Movie m1 = new Movie();

        double re = m1.getTicketPrice("Gold");
        System.out.println(re);

        re = m1.getTicketPrice("Silver");
        System.out.println(re);

        re = m1.getTicketPrice("Platinum");
        System.out.println(re);

        re = m1.getTicketPrice("Balcony");
        System.out.println(re);

        re = m1.getTicketPrice("Front");
        System.out.println(re);

        System.out.println("-------------------------");

        re = m1.getTotalPrice(300, 4, 10);
        System.out.println(re);
    }
}