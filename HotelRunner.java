class HotelRunner {

    public static void main(String[] args) {

        Hotel h1 = new Hotel();

        double re = h1.getRoomPrice("Single");
        System.out.println(re);

        re = h1.getRoomPrice("Double");
        System.out.println(re);

        re = h1.getRoomPrice("Suite");
        System.out.println(re);

        re = h1.getRoomPrice("Deluxe");
        System.out.println(re);

        re = h1.getRoomPrice("Standard");
        System.out.println(re);

        System.out.println("-------------------------");

        re = h1.getTotalBill(2000, 3, 15);
        System.out.println(re);
    }
}