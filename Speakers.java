class Speakers{

public static void displaySpeakersBrand(String brand){
    System.out.println("Speakers Brand: " + brand);
}

static float price = 3500.5f;

public static void displaySpeakersPrice(){
    System.out.println("Speakers Price: " + price);
}

public static String displaySpeakersColour(String colour){
    System.out.println("Speakers Colour: " + colour);
    return colour;
}

static byte ratings = 9;

public static byte displaySpeakersRatings(){
    System.out.println("Speakers Ratings: " + ratings);
    return ratings;
}
}
