class Movies{

public static void displayMoviesName(String name){
    System.out.println("Movies Name: " + name);
}

static long collection = 250000000;

public static void displayCollection(){
    System.out.println("Box Office Collection: " + collection);
}

public static String displayDirector(String director){
    System.out.println("Director: " + director);
    return director;
}

static double rating = 8.7;
public static double displayRating(){
    System.out.println("Movies Rating: " + rating);
    return rating;
}

}