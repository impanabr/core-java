class Books{

public static void displayBooksTitle(String title){
    System.out.println("Books Title: " + title);
}

static double price = 499.99;

public static void displayBooksPrice(){
    System.out.println("Books Price: " + price);
}

public static String displayAuthor(String author){
    System.out.println("Author: " + author);
    return author;
}

static char rating = 'A';
public static char displayRating(){
    System.out.println("Books Rating: " + rating);
    return rating;
}

}