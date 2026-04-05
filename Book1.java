class Book1{
public static void displayBook1Title(String title){
    System.out.println("Book1 Title: " + title);
}
static double price = 499.99;

public static void displayBook1Price(){
    System.out.println("Book1 Price: " + price);
}
public static String displayAuthor(String author){
	System.out.println("Author: " + author);
    return author;
}
static char rating = 'A';

public static char displayRating(){
    System.out.println("Book1 Rating: " + rating);
    return rating;
}
}