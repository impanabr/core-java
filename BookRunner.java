class BookRunner{

public static void main(String[] page){
Book.pages=500;
Book.rating=4.5f;
Book.price=450.75;
Book.isAvailable=true;
Book.title="Java Programming";

System.out.println("pages:"+Book.pages);
System.out.println("rating:"+Book.rating);
System.out.println("price:"+Book.price);
System.out.println("isAvailable:"+Book.isAvailable);
System.out.println("title:"+Book.title);
}
}