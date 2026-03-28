class MovieRunner{

public static void main(String[] film){
Movie.releaseYear=2022;
Movie.duration=2.45f;
Movie.rating='U';
Movie.hit=true;
Movie.title="KGF";

System.out.println("releaseYear:"+Movie.releaseYear);
System.out.println("duration:"+Movie.duration);
System.out.println("rating:"+Movie.rating);
System.out.println("hit:"+Movie.hit);
System.out.println("title:"+Movie.title);
}
}