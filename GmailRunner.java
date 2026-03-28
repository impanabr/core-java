class GmailRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String akash = Gmail.validateAndRegister(80865432187L,"Ant@5670","01-06-1900","akash","akash1");
		System.out.println(akash);
		
		System.out.println("----Second time method call----");
		String sinchana = Gmail.validateAndRegister(70565432187L,"Ant@5670","03-10-2008","sinchana","sinchana1");
		System.out.println(sinchana);
	}
}
	