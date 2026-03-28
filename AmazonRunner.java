class AmazonRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String lohith = Amazon.validateAndRegister(90876732187L,"Ant@5670","09-08-2010","lohith","lohith1");
		System.out.println(lohith);
		
		System.out.println("----Second time method call----");
		String bhindu = Amazon.validateAndRegister(78065432187L,"Ant@5670","20-10-2014","bhindu","bhindu1");
		System.out.println(bhindu);
	}
}
	