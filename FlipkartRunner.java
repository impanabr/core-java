class FlipkartRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String roshan = Flipkart.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","roshan","roshan1");
		System.out.println(roshan);
		
		System.out.println("----Second time method call----");
		String shreya = Flipkart.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","shreya","shreya1");
		System.out.println(shreya);
	}
}
	