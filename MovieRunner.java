class MovieRunner {

    public static void main(String[] args) {

        Movie movie = new Movie();

        String movieName = "kgf";
        int tickets = 4;
        double discount = 20;

        double price = movie.getPriceByMovieName(movieName);
        double total = movie.getTotalAmount(price, tickets);
        double finalAmount = movie.applyDiscount(total, discount);

        System.out.println("Movie: " + movieName);
        System.out.println("Tickets: " + tickets);
        System.out.println("Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
    }
}