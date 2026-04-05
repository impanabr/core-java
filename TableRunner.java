class TableRunner{
public static void main(String[]args){
	Table t1 = new Table("Wood",4,5000.0);
	Table t2 = new Table("Plastic",3,1500.0);
	t1.display();
	System.out.println("----");
	t2.display();
}
}
