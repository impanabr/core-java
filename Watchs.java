class Watchs{

public static void displayWatchsBrand(String brand){
    System.out.println("Watchs Brand: " + brand);
}

static float price = 5000.5f;

public static void displayWatchsPrice(){
    System.out.println("Watchs Price: " + price);
}

public static String displayWatchsColour(String colour){
    System.out.println("Watchs Colour: " + colour);
    return colour;
}

static byte ratings = 7;

public static byte displayWatchsRatings(){
    System.out.println("Watchs Ratings: " + ratings);
    return ratings;
}
}